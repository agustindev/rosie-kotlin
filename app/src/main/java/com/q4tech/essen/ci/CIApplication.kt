package com.q4tech.essen.ci

import com.karumi.rosie.application.RosieApplication
import java.util.*

/**
 * Created by agustingandara on 5/10/17.
 */

class CIApplication : RosieApplication() {

    override fun getApplicationModules(): List<Any> {
        return Arrays.asList(CIApplicationModule() as Any)
    }
}