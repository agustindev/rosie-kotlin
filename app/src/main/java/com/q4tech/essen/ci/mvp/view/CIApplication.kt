package com.q4tech.essen.ci.mvp.view

import android.content.Context
import com.karumi.rosie.application.RosieApplication
import com.q4tech.essen.ci.mvp.module.CIApplicationModule
import io.realm.Realm
import java.util.*

/**
 * Created by agustingandara on 5/10/17.
 */

class CIApplication : RosieApplication() {

    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
        //CIApplication.CONTEXT = applicationContext
    }

    override fun getApplicationModules(): List<Any> {
        return Arrays.asList(CIApplicationModule() as Any)
    }


    /*companion object {
        var CONTEXT: Context? = null
    }*/
}