package com.q4tech.essen.ci.domain.usecase

import com.karumi.rosie.domain.usecase.RosieUseCase
import com.karumi.rosie.domain.usecase.annotation.UseCase
import com.q4tech.essen.ci.domain.model.CIRecipeModel
import com.q4tech.essen.ci.repository.CIRecipeMockDataSource
import com.q4tech.essen.ci.repository.CIRecipeRepository
import javax.inject.Inject

/**
 * Created by agustingandara on 5/10/17.
 */

class CIHomeUseCase @Inject constructor(private var recipeRepository: CIRecipeRepository) : RosieUseCase() {

    @UseCase(name = USE_CASE_SAMPLE) fun call(parameter: String){
        var recipe: CIRecipeModel? = recipeRepository.getByKey("1")
        notifySuccess(recipe?.title)
    }

    companion object {
        const val USE_CASE_SAMPLE = "UseCaseSample"
    }
}
