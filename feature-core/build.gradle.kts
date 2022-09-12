plugins {
    app("library-plugin")
    kotlin("kapt")
}

configureLibrary {
    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
}

dependencies {
    implementation(project(":core"))
    implementation(Dependencies.FeatureCore.libraries)
    kapt(Dependencies.FeatureCore.kaptLibraries)
}