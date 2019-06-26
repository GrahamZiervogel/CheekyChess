/*
 * Copyright (c) All Times Lucky. All rights reserved.
 * Licensed under the GNU Lesser General Public License v3.0. See LICENCE file in the project root for full licence information.
 *
 */

package com.alltimeslucky.cheekychess.model.board

import com.alltimeslucky.cheekychess.model.piece.*
import org.junit.Assert.*
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
    fun getGirdElement_shouldReturnNullWhenGridNotInitialized() {

        assertNull(boardImpl.getGridElement(Pair(0, 0)))

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
        assertEquals(Colour.BLACK, piece?.colour)

        piece = boardImpl.getGridElement(Pair(row, 1))
        assertTrue(piece is Knight)
        assertEquals(Colour.BLACK, piece?.colour)

        piece = boardImpl.getGridElement(Pair(row, 2))
        assertTrue(piece is Bishop)
        assertEquals(Colour.BLACK, piece?.colour)

        piece = boardImpl.getGridElement(Pair(row, 3))
        assertTrue(piece is Queen)
        assertEquals(Colour.BLACK, piece?.colour)

        piece = boardImpl.getGridElement(Pair(row, 4))
        assertTrue(piece is King)
        assertEquals(Colour.BLACK, piece?.colour)

        piece = boardImpl.getGridElement(Pair(row, 5))
        assertTrue(piece is Bishop)
        assertEquals(Colour.BLACK, piece?.colour)

        piece = boardImpl.getGridElement(Pair(row, 6))
        assertTrue(piece is Knight)
        assertEquals(Colour.BLACK, piece?.colour)

        piece = boardImpl.getGridElement(Pair(row, 7))
        assertTrue(piece is Rook)
        assertEquals(Colour.BLACK, piece?.colour)

        row = 1

        for (column in 0 until BoardImpl.WIDTH) {
            piece = boardImpl.getGridElement(Pair(row, column))
            assertTrue(piece is Pawn)
            assertEquals(Colour.BLACK, piece?.colour)
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
            assertEquals(Colour.WHITE, piece?.colour)
        }

        row = 7

        piece = boardImpl.getGridElement(Pair(row, 0))
        assertTrue(piece is Rook)
        assertEquals(Colour.WHITE, piece?.colour)

        piece = boardImpl.getGridElement(Pair(row, 1))
        assertTrue(piece is Knight)
        assertEquals(Colour.WHITE, piece?.colour)

        piece = boardImpl.getGridElement(Pair(row, 2))
        assertTrue(piece is Bishop)
        assertEquals(Colour.WHITE, piece?.colour)

        piece = boardImpl.getGridElement(Pair(row, 3))
        assertTrue(piece is Queen)
        assertEquals(Colour.WHITE, piece?.colour)

        piece = boardImpl.getGridElement(Pair(row, 4))
        assertTrue(piece is King)
        assertEquals(Colour.WHITE, piece?.colour)

        piece = boardImpl.getGridElement(Pair(row, 5))
        assertTrue(piece is Bishop)
        assertEquals(Colour.WHITE, piece?.colour)

        piece = boardImpl.getGridElement(Pair(row, 6))
        assertTrue(piece is Knight)
        assertEquals(Colour.WHITE, piece?.colour)

        piece = boardImpl.getGridElement(Pair(row, 7))
        assertTrue(piece is Rook)
        assertEquals(Colour.WHITE, piece?.colour)

    }
}
