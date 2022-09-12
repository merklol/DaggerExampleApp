import com.android.build.gradle.internal.dsl.BaseAppModuleExtension
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType

class AppConfiguration(
    val appId: String,
    val testInstrumentationRunner: String
) {
    class Builder {
        var appId: String = ""
        var testInstrumentationRunner: String = ""

        fun build() = AppConfiguration(
            appId,
            testInstrumentationRunner
        )
    }
}

fun Project.configureApp(action: AppConfiguration.Builder.() -> Unit) {
    val configuration = AppConfiguration.Builder().apply(action).build()
    val defaultConfig = extensions.getByType<BaseAppModuleExtension>().defaultConfig

    defaultConfig.applicationId = configuration.appId
    defaultConfig.testInstrumentationRunner = configuration.testInstrumentationRunner
}