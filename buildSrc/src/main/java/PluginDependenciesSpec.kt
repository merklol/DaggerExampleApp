import org.gradle.plugin.use.PluginDependenciesSpec

fun PluginDependenciesSpec.app(module: String) = id("com.maximapps.example-app.$module")