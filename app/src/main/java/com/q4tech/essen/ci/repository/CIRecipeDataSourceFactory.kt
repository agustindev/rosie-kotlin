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

import com.karumi.rosie.repository.datasource.*
import com.q4tech.essen.ci.domain.model.*
import com.q4tech.essen.ci.mvp.view.CIApplication
import javax.inject.*

class CIRecipeDataSourceFactory @Inject constructor() {

    fun createDataSource(): ReadableDataSource<String, CIRecipeModel?> {
        if (true) {
            return CIRecipeMockDataSource(CIApplication.CONTEXT)
        } else {
            return CIRecipeCloudDataSource()
        }
    }

}
