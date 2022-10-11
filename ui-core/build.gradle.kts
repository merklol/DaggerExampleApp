plugins {
    app("library-plugin")
}

configureLibrary {
    namespace = "com.maximapps.ui.core"
    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
}

dependencies {
    implementation(Dependencies.UICore.libraries)
}