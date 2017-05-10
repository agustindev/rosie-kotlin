package com.q4tech.essen.ci

import com.karumi.rosie.domain.usecase.UseCaseHandler
import com.karumi.rosie.view.RosiePresenter
import javax.inject.Inject

/**
 * Created by agustingandara on 5/10/17.
 */

class CIHomePresenter @Inject constructor(useCaseHandler: UseCaseHandler) : RosiePresenter<CIHomePresenter.View>(useCaseHandler) {

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

    interface View : RosiePresenter.View {

    }

}
