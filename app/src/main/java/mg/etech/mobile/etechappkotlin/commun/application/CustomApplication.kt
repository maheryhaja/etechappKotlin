package mg.etech.mobile.etechappkotlin.commun.application

import android.app.Application

/**
 * Created by mahery.haja on 24/10/2017.
 */
class CustomApplication : Application() {

    override fun onCreate() {
        super.onCreate()
//        MultiDex.install(this)
    }
}