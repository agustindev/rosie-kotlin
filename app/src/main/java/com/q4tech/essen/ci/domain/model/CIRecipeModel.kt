package com.q4tech.essen.ci.domain.model

import com.karumi.rosie.repository.datasource.Identifiable

/**
 * Created by agustingandara on 5/11/17.
 */

class CIRecipeModel : Identifiable<String> {

    var id: String? = null
    var title: String? = null
    var description: String? = null
    var prepTime: String? = null
    var imageId: String? = null

    override fun getKey(): String? {
        return this.id
    }
}
