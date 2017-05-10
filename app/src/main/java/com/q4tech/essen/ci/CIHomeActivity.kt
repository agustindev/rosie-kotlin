package com.q4tech.essen.ci

import android.os.Bundle
import com.karumi.rosie.view.RosieActivity
import com.karumi.rosie.view.Presenter
import kotlinx.android.synthetic.main.activity_cihome.*
import javax.inject.Inject



class CIHomeActivity : RosieActivity(), CIHomePresenter.View {

    @Inject @Presenter lateinit var presenter: CIHomePresenter

    override fun getLayoutId(): Int { return R.layout.activity_cihome }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        BottomNavigationViewHelper.removeShiftMode(bottomNavigationView)
    }

    override fun getActivityScopeModules(): MutableList<Any> {
        return mutableListOf(CIHomeModule())
    }
}
