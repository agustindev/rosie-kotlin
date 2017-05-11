/*
 *  Copyright (C) 2015 Karumi.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.q4tech.essen.ci.repository

import android.content.Context
import com.google.gson.Gson
import com.karumi.rosie.repository.datasource.*
import com.q4tech.essen.ci.domain.model.*
import com.q4tech.essen.ci.utils.AssetUtils
import javax.inject.*

class CIRecipeMockDataSource @Inject constructor(context: Context?) : EmptyReadableDataSource<String, CIRecipeModel?>() {

    private var recipes: Array<CIRecipeModel>

    init { recipes = Gson().fromJson(AssetUtils.readString(context, "mock.json"), Array<CIRecipeModel>::class.java) }

    @Throws(Exception::class)
    override fun getByKey(key: String?): CIRecipeModel? {
        for (r in recipes) {
            if(r.id == key) return r
        }
        return null
    }

    /*private val cheeseCake: CIRecipeModel  get() {
        val cheesecake = CIRecipeModel()
        cheesecake.id = CHEESE_CAKE
        cheesecake.name = "CheeseCake"
        return cheesecake
    }*/

    /*companion object {

        val CHEESE_CAKE = "1"
    }*/

}
