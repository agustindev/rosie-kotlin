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

class CIHomeBookmarksPresenter @Inject constructor(useCaseHandler: UseCaseHandler, private var homeUseCase: CIHomeUseCase) : RosiePresenter<CIHomeBookmarksPresenter.View>(useCaseHandler) {

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

    interface View : RosiePresenter.View

}
