package com.maximapps.dagger.multi.module.di

import com.maximapps.dagger.multi.module.common.HostActivity
import dagger.Component

@[AppScope Component(modules = [AppModule::class])]
interface AppComponent {
    fun inject(activity: HostActivity)
}