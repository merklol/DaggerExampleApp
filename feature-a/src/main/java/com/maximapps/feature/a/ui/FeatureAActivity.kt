package com.maximapps.feature.a.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import com.maximapps.feature.a.R

class FeatureAActivity : AppCompatActivity(R.layout.activity_feature_a) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportFragmentManager.commit {
            replace(R.id.fragment_container, FeatureAFragment(), FEATURE_A)
        }
    }

    private companion object {
        const val FEATURE_A = "feature.a"
    }
}