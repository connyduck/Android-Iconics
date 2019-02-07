/*
 * Copyright (c) 2019 Mike Penz
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.mikepenz.iconics.sample

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.mikepenz.iconics.utils.IconicsUtils

/**
 * @author pa.gulko zTrap (28.10.2017)
 */
class SpaceItemDecoration : RecyclerView.ItemDecoration() {

    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        val space = IconicsUtils.convertDpToPx(view.context, 8)
        val position = parent.getChildAdapterPosition(view)
        if (position < 2) {
            outRect.top = space
        }
        if ((position + 1) % 2 == 0) {
            outRect.right = space
        }
        outRect.left = space
        outRect.bottom = outRect.left
    }
}