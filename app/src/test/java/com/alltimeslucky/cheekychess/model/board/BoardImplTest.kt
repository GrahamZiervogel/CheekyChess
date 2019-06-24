/*
 * Copyright (c) All Times Lucky. All rights reserved.
 * Licensed under the GNU Lesser General Public License v3.0. See LICENCE file in the project root for full licence information.
 *
 */

package com.alltimeslucky.cheekychess.model.board

import com.alltimeslucky.cheekychess.model.piece.*
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import kotlin.properties.Delegates

class BoardImplTest {

    private var boardImpl: BoardImpl by Delegates.notNull()

    @Before
    fun setup() {
        boardImpl = BoardImpl(pieceFactory = PieceFactoryImpl())
    }

    @Test
    fun getGridElement_shouldReturnGridElement() {

        boardImpl.initializeGrid()

        val piece: Piece? = boardImpl.getGridElement(Pair(0, 0))
        assertTrue(piece is Rook)

    }

    @Test
    fun initializeGrid_shouldSetupStandardChessGame() {

        boardImpl.initializeGrid()

        var row = 0
        var piece: Piece?

        piece = boardImpl.getGridElement(Pair(row, 0))
        assertTrue(piece is Rook)
        piece = boardImpl.getGridElement(Pair(row, 1))
        assertTrue(piece is Knight)
        piece = boardImpl.getGridElement(Pair(row, 2))
        assertTrue(piece is Bishop)
        piece = boardImpl.getGridElement(Pair(row, 3))
        assertTrue(piece is King)
        piece = boardImpl.getGridElement(Pair(row, 4))
        assertTrue(piece is Queen)
        piece = boardImpl.getGridElement(Pair(row, 5))
        assertTrue(piece is Bishop)
        piece = boardImpl.getGridElement(Pair(row, 6))
        assertTrue(piece is Knight)
        piece = boardImpl.getGridElement(Pair(row, 7))
        assertTrue(piece is Rook)

        row = 1
        for (column in 0 until BoardImpl.WIDTH) {
            piece = boardImpl.getGridElement(Pair(row, column))
            assertTrue(piece is Pawn)
        }

        for (rowIter in 2 until 6) {
            for (column in 0 until BoardImpl.WIDTH) {
                piece = boardImpl.getGridElement(Pair(rowIter, column))
                assertNull(piece)
            }
        }

        row = 6
        for (column in 0 until BoardImpl.WIDTH) {
            piece = boardImpl.getGridElement(Pair(row, column))
            assertTrue(piece is Pawn)
        }

        row = 7
        piece = boardImpl.getGridElement(Pair(row, 0))
        assertTrue(piece is Rook)
        piece = boardImpl.getGridElement(Pair(row, 1))
        assertTrue(piece is Knight)
        piece = boardImpl.getGridElement(Pair(row, 2))
        assertTrue(piece is Bishop)
        piece = boardImpl.getGridElement(Pair(row, 3))
        assertTrue(piece is King)
        piece = boardImpl.getGridElement(Pair(row, 4))
        assertTrue(piece is Queen)
        piece = boardImpl.getGridElement(Pair(row, 5))
        assertTrue(piece is Bishop)
        piece = boardImpl.getGridElement(Pair(row, 6))
        assertTrue(piece is Knight)
        piece = boardImpl.getGridElement(Pair(row, 7))
        assertTrue(piece is Rook)

    }
}
