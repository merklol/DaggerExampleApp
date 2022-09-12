package com.maximapps.dagger.multi.module.common

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.maximapps.dagger.multi.module.R
import com.maximapps.feature.a.ui.FeatureAActivity
import com.maximapps.feature.a.di.FeatureAApi
import javax.inject.Inject

class HostActivity : AppCompatActivity(R.layout.activity_host) {
    @Inject
    lateinit var featureAApi: FeatureAApi

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (application as App).appComponent.inject(this)
        startActivity(Intent(this, FeatureAActivity::class.java))
    }
}