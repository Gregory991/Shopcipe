package com.badvok.ingreed.base

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin

class ShopcipeApplication : Application() {

    // commit 1 cat
    // commit 2 cat
    // cat 2.5
    // commit 3 cat
    // commit 4 cat

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@ShopcipeApplication)
            modules(appModule)
        }
    }
}