/*
 * Copyright (c) All Times Lucky. All rights reserved.
 * Licensed under the GNU Lesser General Public License v3.0. See LICENCE file in the project root for full licence information.
 *
 */

package com.alltimeslucky.cheekychess.controller

import com.alltimeslucky.cheekychess.model.selection.Selection
import com.alltimeslucky.cheekychess.view.CoordinateMapper

class SelectionController(private val coordinateMapper: CoordinateMapper, private val selection: Selection) {

    fun select(pixelCoordinates: Pair<Float, Float>) {

        val gridCoordinates = coordinateMapper.mapPixelCoordinatesToGridCoordinates(pixelCoordinates)
        selection.set(gridCoordinates)

    }

}
