package com.maximapps.dagger.multi.module.common

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.maximapps.dagger.multi.module.R
import com.maximapps.feature.a.ui.FeatureAActivity

class HostActivity : AppCompatActivity(R.layout.activity_host) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivity(Intent(this, FeatureAActivity::class.java))
    }
}