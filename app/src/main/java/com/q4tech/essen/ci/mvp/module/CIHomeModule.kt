package com.q4tech.essen.ci.mvp.module

import com.q4tech.essen.ci.mvp.view.activity.CIHomeActivity
import dagger.*

/**
 * Created by agustingandara on 5/10/17.
 */

@Module(library = true, complete = false, injects = arrayOf(CIHomeActivity::class)) class CIHomeModule
