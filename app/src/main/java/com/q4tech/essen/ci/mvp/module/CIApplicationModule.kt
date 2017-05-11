package com.q4tech.essen.ci.mvp.module

import com.q4tech.essen.ci.mvp.view.CIApplication
import dagger.Module

/**
 * Created by agustingandara on 5/10/17.
 */

@Module(library = true, complete = false, injects = arrayOf(CIApplication::class)) class CIApplicationModule

