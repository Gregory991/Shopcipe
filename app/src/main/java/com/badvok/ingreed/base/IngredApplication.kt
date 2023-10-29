package com.badvok.ingreed.base

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin

class IngredApplication : Application() {


    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@IngredApplication)
            modules(appModule)
        }
    }
}