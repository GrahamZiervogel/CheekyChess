/*
 * Copyright (c) All Times Lucky. All rights reserved.
 * Licensed under the GNU Lesser General Public License v3.0. See LICENCE file in the project root for full licence information.
 *
 */

package com.alltimeslucky.cheekychess.model.piece

import com.alltimeslucky.cheekychess.model.board.Board

class Pawn(override val colour: Colour) : Piece() {

    override val pointValue = 1

    override fun getPossibleMoveSquares(board: Board, gridCoordinates: Pair<Int, Int>): List<Pair<Int, Int>> {

        val possibleMoveSquares = mutableListOf<Pair<Int, Int>>()

        if (colour == Colour.WHITE) {
            possibleMoveSquares.add(Pair(gridCoordinates.first - 1, gridCoordinates.second))
        } else if (colour == Colour.BLACK) {
            possibleMoveSquares.add(Pair(gridCoordinates.first + 1, gridCoordinates.second))
        }

        return possibleMoveSquares

    }

}
