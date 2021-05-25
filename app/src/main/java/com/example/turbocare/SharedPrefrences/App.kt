package com.example.turbocare.SharedPrefrences

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build

class App: Application() {
    private lateinit var context : Context
    val CHANNEL_ID = "turboCare"

    companion object{
        public lateinit var appPreference1: AppPrefrences


        val appInstance: App? = null

        fun getAppPreference(): AppPrefrences? {
            return appPreference1
        }

    }
    override fun onCreate() {
        super.onCreate()
        context = applicationContext
        appPreference1 = AppPrefrences.init(context, "turboCare")
    }

}