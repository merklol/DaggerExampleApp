import com.android.build.gradle.LibraryExtension
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType

class LibraryConfiguration(val testInstrumentationRunner: String) {
    class Builder {
        var testInstrumentationRunner: String = ""

        fun build() = LibraryConfiguration(testInstrumentationRunner)
    }
}

fun Project.configureLibrary(action: LibraryConfiguration.Builder.() -> Unit) {
    val configuration = LibraryConfiguration.Builder().apply(action).build()
    val defaultConfig = extensions.getByType<LibraryExtension>().defaultConfig

    defaultConfig.testInstrumentationRunner = configuration.testInstrumentationRunner
}