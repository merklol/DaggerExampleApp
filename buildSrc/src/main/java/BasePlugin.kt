import org.gradle.api.JavaVersion
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.plugins.ExtensionAware
import org.gradle.kotlin.dsl.configure
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmOptions
import com.android.build.gradle.BaseExtension

abstract class BasePlugin : Plugin<Project> {

    protected abstract fun plugins(project: Project)

    protected abstract fun android(project: Project)

    override fun apply(target: Project) {
        plugins(target)
        android(target)
    }

    protected fun compileOptions(extension: BaseExtension) = with(extension) {
        compileOptions {
            sourceCompatibility = JavaVersion.VERSION_1_8
            targetCompatibility = JavaVersion.VERSION_1_8
        }

        (this as ExtensionAware).configure<KotlinJvmOptions> { jvmTarget = AppConfig.jvmTarget }
    }
}