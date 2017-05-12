package com.q4tech.essen.ci.mvp.view.fragment

import com.karumi.rosie.view.Presenter
import com.karumi.rosie.view.RosieFragment
import com.q4tech.essen.ci.R
import com.q4tech.essen.ci.mvp.presenter.activity.CIHomeBookmarksPresenter
import com.q4tech.essen.ci.mvp.presenter.activity.CIHomeRecipeSearchPresenter
import javax.inject.Inject

/**
 * Created by agustingandara on 5/10/17.
 */

class CIHomeBookmarksFragment : RosieFragment(), CIHomeBookmarksPresenter.View {

    @Inject @Presenter lateinit var presenter: CIHomeBookmarksPresenter

    override fun getLayoutId(): Int { return R.layout.fragment_cihome_bookmarks }

}
