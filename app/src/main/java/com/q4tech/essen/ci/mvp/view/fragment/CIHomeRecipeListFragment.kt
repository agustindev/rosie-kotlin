package com.q4tech.essen.ci.mvp.view.fragment

import com.karumi.rosie.view.Presenter
import com.karumi.rosie.view.RosieFragment
import com.q4tech.essen.ci.R
import com.q4tech.essen.ci.mvp.presenter.activity.CIHomeRecipeSearchPresenter
import javax.inject.Inject

/**
 * Created by agustingandara on 5/10/17.
 */

class CIHomeRecipeListFragment : RosieFragment(), CIHomeRecipeSearchPresenter.View {

    @Inject @Presenter lateinit var presenter: CIHomeRecipeSearchPresenter

    override fun getLayoutId(): Int { return R.layout.fragment_cihome_recipelist }

}
