/*
 * Copyright (c) All Times Lucky. All rights reserved.
 * Licensed under the GNU Lesser General Public License v3.0. See LICENCE file in the project root for full licence information.
 *
 */

package com.alltimeslucky.cheekychess.model.board

import com.alltimeslucky.cheekychess.model.piece.Pawn
import com.alltimeslucky.cheekychess.model.piece.Piece
import com.alltimeslucky.cheekychess.model.piece.PieceFactory

class BoardImpl(private val pieceFactory: PieceFactory) : Board {

    private var pieceGrid = Array<Array<Piece?>>(HEIGHT) {
        Array(WIDTH) { null }
    }

    override fun getGridElement(gridCoordinates: Pair<Int, Int>): Piece? {
        return pieceGrid[gridCoordinates.first][gridCoordinates.second]
    }

    override fun initializeGrid() {

        var row = 0
        pieceGrid[row][0] = pieceFactory.makeNewRook()
        pieceGrid[row][1] = pieceFactory.makeNewKnight()
        pieceGrid[row][2] = pieceFactory.makeNewBishop()
        pieceGrid[row][3] = pieceFactory.makeNewKing()
        pieceGrid[row][4] = pieceFactory.makeNewQueen()
        pieceGrid[row][5] = pieceFactory.makeNewBishop()
        pieceGrid[row][6] = pieceFactory.makeNewKnight()
        pieceGrid[row][7] = pieceFactory.makeNewRook()

        row = 1
        for (column in 0 until WIDTH) {
            pieceGrid[row][column] = Pawn()
        }

        row = 6
        for (column in 0 until WIDTH) {
            pieceGrid[row][column] = Pawn()
        }

        row = 7
        pieceGrid[row][0] = pieceFactory.makeNewRook()
        pieceGrid[row][1] = pieceFactory.makeNewKnight()
        pieceGrid[row][2] = pieceFactory.makeNewBishop()
        pieceGrid[row][3] = pieceFactory.makeNewKing()
        pieceGrid[row][4] = pieceFactory.makeNewQueen()
        pieceGrid[row][5] = pieceFactory.makeNewBishop()
        pieceGrid[row][6] = pieceFactory.makeNewKnight()
        pieceGrid[row][7] = pieceFactory.makeNewRook()

    }

    companion object {
        private const val HEIGHT = 8
        const val WIDTH = 8
    }

}
