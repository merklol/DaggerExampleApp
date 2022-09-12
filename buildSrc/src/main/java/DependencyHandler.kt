import org.gradle.api.artifacts.dsl.DependencyHandler

fun DependencyHandler.implementation(dependencyNotations: List<Any>) = dependencyNotations
    .forEach { dependencyNotation -> add("implementation", dependencyNotation) }

fun DependencyHandler.kapt(dependencyNotations: List<Any>) = dependencyNotations
    .forEach { dependencyNotation -> add("kapt", dependencyNotation) }
