plugins {
    app("library-plugin")
}

configureLibrary {
    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
}

dependencies {
    implementation(Dependencies.UICore.libraries)
}