/*
 * Copyright (c) All Times Lucky. All rights reserved.
 * Licensed under the GNU Lesser General Public License v3.0. See LICENCE file in the project root for full licence information.
 *
 */

package com.alltimeslucky.cheekychess.controller

import com.alltimeslucky.cheekychess.model.board.Board
import com.alltimeslucky.cheekychess.view.CoordinateMapper

class BoardController(private val board: Board, private val coordinateMapper: CoordinateMapper) {

    fun selectPiece(pixelCoordinates: Pair<Float, Float>) {

        val gridCoordinates = coordinateMapper.mapPixelCoordinatesToGridCoordinates(pixelCoordinates)
        board.selectedGridLocation = gridCoordinates

    }

    private fun movePiece() {

    }

}
