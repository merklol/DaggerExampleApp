plugins {
    app("app-plugin")
    kotlin("kapt")
}
configureApp {
    appId = "com.maximapps.dagger.multi.module"
    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
}


dependencies {
    implementation(project(":core"))
    implementation(project(":ui-core"))
    implementation(project(":feature-a"))
    implementation(Dependencies.App.libaries)
    kapt(Dependencies.App.kaptLibraries)
}