object Dependencies {
    private const val coreKtx = "androidx.core:core-ktx:1.8.0"
    private const val appCompat = "androidx.appcompat:appcompat:1.5.0"
    private const val material = "com.google.android.material:material:1.6.1"
    private const val lifecycle = "androidx.lifecycle:lifecycle-runtime-ktx:2.5.1"
    private const val fragmentKtx = "androidx.fragment:fragment-ktx:1.5.2"
    private const val dagger = "com.google.dagger:dagger:2.42"
    private const val daggerCompiler = "com.google.dagger:dagger-compiler:2.42"
    private const val viewBinding = "com.github.kirich1409:viewbindingpropertydelegate:1.5.6"


    object App {
        val libaries = listOf(
            coreKtx,
            appCompat,
            material,
            dagger
        )

        val kaptLibraries = listOf(daggerCompiler)
    }

    object FeatureA {
        val libraries = listOf(
            coreKtx,
            appCompat,
            material,
            lifecycle,
            fragmentKtx,
            dagger,
            viewBinding
        )

        val kaptLibraries = listOf(daggerCompiler)
    }

    object FeatureCore {
        val libraries = listOf(
            coreKtx,
            appCompat,
            material,
            dagger
        )

        val kaptLibraries = listOf(daggerCompiler)
    }

    object Core {
        val libraries = listOf(
            coreKtx,
            appCompat,
            material,
            lifecycle
        )
    }

    object UICore {
        val libraries = listOf(
            coreKtx,
            appCompat,
            material,
        )
    }
}