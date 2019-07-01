/*
 * Copyright (c) All Times Lucky. All rights reserved.
 * Licensed under the GNU Lesser General Public License v3.0. See LICENCE file in the project root for full licence information.
 *
 */

package com.alltimeslucky.cheekychess.model.board

import com.alltimeslucky.cheekychess.model.piece.Piece
import com.alltimeslucky.cheekychess.model.piece.PieceFactory

class BoardImpl(private val pieceFactory: PieceFactory) : Board {

    private var pieceGrid = Array<Array<Piece?>>(HEIGHT) {
        Array(WIDTH) { null }
    }

    override var selectedGridLocation: Pair<Int, Int>? = null

    override fun getGridElement(gridCoordinates: Pair<Int, Int>): Piece? {
        return pieceGrid[gridCoordinates.first][gridCoordinates.second]
    }

    override fun initializeGrid() {

        var row = 0
        pieceGrid[row][0] = pieceFactory.makeNewBlackRook()
        pieceGrid[row][1] = pieceFactory.makeNewBlackKnight()
        pieceGrid[row][2] = pieceFactory.makeNewBlackBishop()
        pieceGrid[row][3] = pieceFactory.makeNewBlackQueen()
        pieceGrid[row][4] = pieceFactory.makeNewBlackKing()
        pieceGrid[row][5] = pieceFactory.makeNewBlackBishop()
        pieceGrid[row][6] = pieceFactory.makeNewBlackKnight()
        pieceGrid[row][7] = pieceFactory.makeNewBlackRook()

        row = 1
        for (column in 0 until WIDTH) {
            pieceGrid[row][column] = pieceFactory.makeNewBlackPawn()
        }

        row = 6
        for (column in 0 until WIDTH) {
            pieceGrid[row][column] = pieceFactory.makeNewWhitePawn()
        }

        row = 7
        pieceGrid[row][0] = pieceFactory.makeNewWhiteRook()
        pieceGrid[row][1] = pieceFactory.makeNewWhiteKnight()
        pieceGrid[row][2] = pieceFactory.makeNewWhiteBishop()
        pieceGrid[row][3] = pieceFactory.makeNewWhiteQueen()
        pieceGrid[row][4] = pieceFactory.makeNewWhiteKing()
        pieceGrid[row][5] = pieceFactory.makeNewWhiteBishop()
        pieceGrid[row][6] = pieceFactory.makeNewWhiteKnight()
        pieceGrid[row][7] = pieceFactory.makeNewWhiteRook()

    }

    companion object {
        private const val HEIGHT = 8
        const val WIDTH = 8
    }

}
