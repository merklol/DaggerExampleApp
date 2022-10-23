package com.maximapps.dagger.multi.module.common

import android.app.Application

fun interface FeatureLauncher {
    fun onLaunch(application: Application)
}