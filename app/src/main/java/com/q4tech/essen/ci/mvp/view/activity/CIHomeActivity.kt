package com.q4tech.essen.ci.mvp.view.activity

import android.os.Bundle
import com.karumi.rosie.view.RosieActivity
import com.karumi.rosie.view.Presenter
import com.q4tech.essen.ci.mvp.module.CIHomeModule
import com.q4tech.essen.ci.mvp.presenter.CIHomePresenter
import com.q4tech.essen.ci.R
import com.q4tech.essen.ci.utils.helpers.BottomNavigationViewHelper
import kotlinx.android.synthetic.main.activity_cihome.*
import javax.inject.Inject



class CIHomeActivity : RosieActivity(), CIHomePresenter.View {

    @Inject @Presenter lateinit var presenter: CIHomePresenter

    override fun getLayoutId(): Int { return R.layout.activity_cihome }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        BottomNavigationViewHelper.removeShiftMode(bottomNavigationView)
        runUseCaseButton.setOnClickListener({ presenter.callUseCaseSample() })
    }

    override fun changeTextSample(text: String){
        repositoryResultTextView.text = text
    }

    override fun getActivityScopeModules(): MutableList<Any> {
        return mutableListOf(CIHomeModule())
    }
}
