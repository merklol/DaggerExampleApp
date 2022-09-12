import com.android.build.gradle.LibraryExtension
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class LibraryPlugin : BasePlugin() {

    override fun plugins(project: Project) {
        project.plugins.run {
            apply("com.android.library")
            apply("kotlin-android")
        }
    }

    override fun android(project: Project) {
        project.configure<LibraryExtension> {
            compileSdk = AppConfig.compileSdk
            defaultConfig(this)
            buildTypes(this)
            compileOptions(this)
            buildFeatures { viewBinding = true }
        }
    }

    private fun defaultConfig(extension: LibraryExtension) {
        extension.defaultConfig {
            minSdk = AppConfig.minSdk
            targetSdk = AppConfig.targetSdk
            consumerProguardFiles("consumer-rules.pro")
        }
    }

    private fun buildTypes(extension: LibraryExtension) = with(extension) {
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