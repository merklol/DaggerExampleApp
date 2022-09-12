import org.gradle.api.Project
import com.android.build.gradle.internal.dsl.BaseAppModuleExtension
import org.gradle.kotlin.dsl.configure

class AppPlugin : BasePlugin() {

    override fun plugins(project: Project): Unit = project.plugins.run {
        apply("com.android.application")
        apply("kotlin-android")
    }

    override fun android(project: Project) = project.configure<BaseAppModuleExtension> {
        compileSdk = AppConfig.compileSdk
        defaultConfig(this)
        buildTypes(this)
        compileOptions(this)
        buildFeatures { viewBinding = true }
    }

    private fun defaultConfig(extension: BaseAppModuleExtension) {
        extension.defaultConfig {
            minSdk = AppConfig.minSdk
            targetSdk = AppConfig.targetSdk
            versionCode = AppConfig.versionCode
            versionName = AppConfig.versionName
        }
    }

    private fun buildTypes(extension: BaseAppModuleExtension) = with(extension) {
        buildTypes {
            release {
                isMinifyEnabled = false
                proguardFiles(
                    getDefaultProguardFile("proguard-android-optimize.txt"),
                    "proguard-rules.pro"
                )
            }
        }
    }
}