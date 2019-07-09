/*
 * Copyright (c) All Times Lucky. All rights reserved.
 * Licensed under the GNU Lesser General Public License v3.0. See LICENCE file in the project root for full licence information.
 *
 */

package com.alltimeslucky.cheekychess.model.selection

import com.alltimeslucky.cheekychess.model.board.Board
import com.alltimeslucky.cheekychess.model.piece.Piece

class SelectionImpl(private val board: Board) : Selection {

    private var selectedGridCoordinates: Pair<Int, Int>? = null


    override fun get(): Pair<Int, Int>? {
        return selectedGridCoordinates
    }

    override fun set(gridCoordinates: Pair<Int, Int>) {

        if (gridCoordinates.first < 0 || gridCoordinates.first > board.getHeight() - 1 ||
            gridCoordinates.second < 0 || gridCoordinates.second > board.getWidth() - 1
        ) {

            selectedGridCoordinates = null

        } else {

            val firstGridCoordinatesCopy = selectedGridCoordinates
            val piece: Piece? = board.getGridElement(gridCoordinates)

            if (firstGridCoordinatesCopy == null && piece != null) {

                selectedGridCoordinates = gridCoordinates

                piece.getPossibleMoveSquares(board, gridCoordinates)

            } else if (firstGridCoordinatesCopy != null) {

                if (gridCoordinates == firstGridCoordinatesCopy) {

                    selectedGridCoordinates = null

                } else {

                    if (board.move(firstGridCoordinatesCopy, gridCoordinates)) {
                        selectedGridCoordinates = null
                    } else {
                        selectedGridCoordinates = gridCoordinates
                    }

                }

            }

        }

    }

}
