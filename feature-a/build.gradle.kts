plugins {
    app("library-plugin")
    kotlin("kapt")
}

configureLibrary {
    namespace = "com.maximapps.feature.a"
    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
}

dependencies {
    implementation(project(":core"))
    implementation(project(":ui-core"))
    implementation(project(":feature-core"))
    implementation(Dependencies.FeatureA.libraries)
    kapt(Dependencies.FeatureA.kaptLibraries)
}