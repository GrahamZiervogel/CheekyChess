/*
 * Copyright (c) All Times Lucky. All rights reserved.
 * Licensed under the GNU Lesser General Public License v3.0. See LICENCE file in the project root for full licence information.
 *
 */

package com.alltimeslucky.cheekychess.view

class CoordinateMapper {

    private var boardSquareSideLength: Float = 0F

    var layoutHeight: Int = 0
    var layoutWidth: Int = 0
        set(value) {
            field = value
            boardSquareSideLength = value / 8F
        }

    fun getBoardSquareSideLength(): Float {

        return boardSquareSideLength

    }

    fun mapGridCoordinatesToPixelCoordinates(gridCoordinates: Pair<Int, Int>): Pair<Float, Float> {

        val topAndBottomExcess = (layoutHeight - layoutWidth) / 2F

        val startPixelRow = topAndBottomExcess + boardSquareSideLength * gridCoordinates.first
        val startPixelCol = boardSquareSideLength * gridCoordinates.second

        return Pair(startPixelRow, startPixelCol)

    }

    fun mapPixelCoordinatesToGridCoordinates(pixelCoordinates: Pair<Float, Float>): Pair<Int, Int> {

        // TODO: HOLLLLLLAAAAAAAAAAAAAA
        return Pair(0, 0)

    }

}
