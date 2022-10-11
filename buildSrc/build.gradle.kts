plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    google()
}

dependencies {
    implementation("com.android.tools.build:gradle:7.3.0")
    implementation(kotlin("gradle-plugin", version = "1.7.10"))
}

gradlePlugin {
    plugins {
        register("library-plugin") {
            displayName = "Library plugin"
            description = "Configure library modules"
            id = "com.maximapps.example-app.library-plugin"
            implementationClass = "LibraryPlugin"
        }

        register("app-plugin") {
            displayName = "App plugin"
            description = "Configure app modules"
            id = "com.maximapps.example-app.app-plugin"
            implementationClass = "AppPlugin"
        }
    }
}