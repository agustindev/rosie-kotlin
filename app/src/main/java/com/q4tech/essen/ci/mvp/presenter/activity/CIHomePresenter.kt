package com.q4tech.essen.ci.mvp.presenter.activity

import com.karumi.rosie.domain.usecase.UseCaseHandler
import com.karumi.rosie.domain.usecase.annotation.Success
import com.karumi.rosie.domain.usecase.callback.OnSuccessCallback
import com.karumi.rosie.view.RosiePresenter
import com.q4tech.essen.ci.domain.usecase.CIHomeUseCase
import javax.inject.Inject

/**
 * Created by agustingandara on 5/10/17.
 */

class CIHomePresenter @Inject constructor(useCaseHandler: UseCaseHandler, private var homeUseCase: CIHomeUseCase) : RosiePresenter<CIHomePresenter.View>(useCaseHandler) {

    override fun initialize() {
        super.initialize()
    }

    override fun update() {
        super.update()
    }

    override fun pause() {
        super.pause()
    }

    override fun destroy() {
        super.destroy()
    }

    fun callUseCaseSample() {

        createUseCaseCall(homeUseCase)
        .useCaseName(CIHomeUseCase.USE_CASE_SAMPLE).args("SOMETHING")
        .onSuccess(object : OnSuccessCallback { @Success fun onSuccess(response: String) {

        }}).execute()
    }

    interface View : RosiePresenter.View

}
