package com.maximapps.dagger.multi.module.common

import android.app.Application
import com.maximapps.dagger.multi.module.di.AppComponent
import com.maximapps.dagger.multi.module.di.DaggerAppComponent

class App: Application() {
    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder().build()
    }
}