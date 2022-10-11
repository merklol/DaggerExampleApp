plugins {
    app("library-plugin")
}

configureLibrary {
    namespace = "com.maximapps.core"
    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
}

dependencies {
    implementation(Dependencies.Core.libraries)
}