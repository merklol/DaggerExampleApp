import com.android.build.gradle.internal.dsl.BaseAppModuleExtension
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType

class AppConfiguration(
    val appId: String,
    val namespace: String,
    val testInstrumentationRunner: String
) {
    class Builder {
        var appId: String = ""
        var namespace: String = ""
        var testInstrumentationRunner: String = ""

        fun build() = AppConfiguration(
            appId,
            namespace,
            testInstrumentationRunner
        )
    }
}

fun Project.configureApp(action: AppConfiguration.Builder.() -> Unit) {
    val configuration = AppConfiguration.Builder().apply(action).build()
    val extension = extensions.getByType<BaseAppModuleExtension>()

    extension.namespace = configuration.namespace
    extension.defaultConfig.applicationId = configuration.appId
    extension.defaultConfig.testInstrumentationRunner = configuration.testInstrumentationRunner
}