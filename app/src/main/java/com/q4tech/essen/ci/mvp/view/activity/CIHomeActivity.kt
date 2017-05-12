package com.q4tech.essen.ci.mvp.view.activity

import android.os.Bundle
import android.view.MenuItem
import com.karumi.rosie.view.RosieActivity
import com.karumi.rosie.view.Presenter
import com.q4tech.essen.ci.mvp.module.CIHomeModule
import com.q4tech.essen.ci.mvp.presenter.activity.CIHomePresenter
import com.q4tech.essen.ci.R
import com.q4tech.essen.ci.mvp.view.fragment.CIHomeBookmarksFragment
import com.q4tech.essen.ci.mvp.view.fragment.CIHomeProfileFragment
import com.q4tech.essen.ci.mvp.view.fragment.CIHomeRecipeListFragment
import com.q4tech.essen.ci.mvp.view.fragment.CIHomeRecipeSearchFragment
import com.q4tech.essen.ci.utils.helpers.BottomNavigationViewHelper
import kotlinx.android.synthetic.main.activity_cihome.*
import javax.inject.Inject



class CIHomeActivity : RosieActivity(), CIHomePresenter.View {

    @Inject @Presenter lateinit var presenter: CIHomePresenter

    private val homeRecipeListFragment: CIHomeRecipeListFragment = CIHomeRecipeListFragment()
    private val homeRecipeSearchFragment: CIHomeRecipeSearchFragment = CIHomeRecipeSearchFragment()
    private val homeBookmarksFragment: CIHomeBookmarksFragment = CIHomeBookmarksFragment()
    private val homeProfileFragment: CIHomeProfileFragment = CIHomeProfileFragment()

    override fun getLayoutId(): Int { return R.layout.activity_cihome }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        BottomNavigationViewHelper.removeShiftMode(bottomNavigationView)

        bottomNavigationView.setOnNavigationItemSelectedListener{ menuItem:MenuItem ->
            when(menuItem.itemId){
                R.id.actionRecipeList -> fragmentManager.beginTransaction().replace(R.id.fragmentFrameLayout, homeRecipeListFragment).commit()
                R.id.actionRecipeSearch -> fragmentManager.beginTransaction().replace(R.id.fragmentFrameLayout, homeRecipeSearchFragment).commit()
                R.id.actionBookmarks -> fragmentManager.beginTransaction().replace(R.id.fragmentFrameLayout, homeBookmarksFragment).commit()
                R.id.actionProfile -> fragmentManager.beginTransaction().replace(R.id.fragmentFrameLayout, homeProfileFragment).commit()
            }
            return@setOnNavigationItemSelectedListener true
        }

        fragmentManager.beginTransaction().replace(R.id.fragmentFrameLayout, homeRecipeListFragment).commit()
    }

    override fun getActivityScopeModules(): MutableList<Any> { return mutableListOf(CIHomeModule()) }
}
