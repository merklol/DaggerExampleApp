import com.android.build.gradle.LibraryExtension
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType

class LibraryConfiguration(val namespace: String, val testInstrumentationRunner: String) {
    class Builder {
        var namespace: String = ""
        var testInstrumentationRunner: String = ""

        fun build() = LibraryConfiguration(namespace, testInstrumentationRunner)
    }
}

fun Project.configureLibrary(action: LibraryConfiguration.Builder.() -> Unit) {
    val configuration = LibraryConfiguration.Builder().apply(action).build()
    val extension = extensions.getByType<LibraryExtension>()

    extension.namespace = configuration.namespace
    extension.defaultConfig.testInstrumentationRunner = configuration.testInstrumentationRunner
}