package com.q4tech.essen.ci.mvp.module

import com.q4tech.essen.ci.mvp.view.activity.CIHomeActivity
import com.q4tech.essen.ci.mvp.view.fragment.CIHomeBookmarksFragment
import com.q4tech.essen.ci.mvp.view.fragment.CIHomeProfileFragment
import com.q4tech.essen.ci.mvp.view.fragment.CIHomeRecipeListFragment
import com.q4tech.essen.ci.mvp.view.fragment.CIHomeRecipeSearchFragment
import dagger.*

/**
 * Created by agustingandara on 5/10/17.
 */

@Module(library = true, complete = false, injects = arrayOf(CIHomeActivity::class, CIHomeRecipeListFragment::class, CIHomeRecipeSearchFragment::class, CIHomeBookmarksFragment::class, CIHomeProfileFragment::class)) class CIHomeModule
