/*
 * Copyright (c) All Times Lucky. All rights reserved.
 * Licensed under the GNU Lesser General Public License v3.0. See LICENCE file in the project root for full licence information.
 *
 */

package com.alltimeslucky.cheekychess.view

class GridToPixelMapper {

    private var squareHeight: Float = 0F
    private var squareWidth: Float = 0F

    var layoutHeight: Int = 0
    var layoutWidth: Int = 0
        set(value) {
            field = value
            squareHeight = value / 8F
            squareWidth = value / 8F
        }

    fun mapGridIndicesToStartPixels(pieceRow: Int, pieceCol: Int): Pair<Float, Float> {

        val topAndBottomExcess = (layoutHeight - layoutWidth) / 2F

        val x = squareWidth * pieceCol
        val y = topAndBottomExcess + squareWidth * pieceRow

        return Pair(x, y)

    }

    fun getBoardSquareDimensions(): Pair<Float, Float> {

        return Pair(squareHeight, squareWidth)

    }

}
