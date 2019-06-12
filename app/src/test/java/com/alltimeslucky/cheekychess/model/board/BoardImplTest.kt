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
    fun initializeGrid_shouldSetupStandardChessGame() {

        boardImpl.initializeGrid()

        var piece: Piece? = boardImpl.getGridElement(0, 0)
        assertTrue(piece is Rook)

        var row = 0

        piece = boardImpl.getGridElement(row, 1)
        assertTrue(piece is Knight)

        piece = boardImpl.getGridElement(row, 2)
        assertTrue(piece is Bishop)

        piece = boardImpl.getGridElement(row, 3)
        assertTrue(piece is Queen)

        piece = boardImpl.getGridElement(row, 4)
        assertTrue(piece is King)

        piece = boardImpl.getGridElement(row, 5)
        assertTrue(piece is Bishop)

        piece = boardImpl.getGridElement(row, 6)
        assertTrue(piece is Knight)

        piece = boardImpl.getGridElement(row, 7)
        assertTrue(piece is Rook)

        row = 1

        for (column in 0 until BoardImpl.WIDTH) {
            piece = boardImpl.getGridElement(row, column)
            assertTrue(piece is Pawn)
        }

        row = 6

        for (column in 0 until BoardImpl.WIDTH) {
            piece = boardImpl.getGridElement(row, column)
            assertTrue(piece is Pawn)
        }

        row = 7

        piece = boardImpl.getGridElement(row, 0)
        assertTrue(piece is Rook)

        piece = boardImpl.getGridElement(row, 1)
        assertTrue(piece is Knight)

        piece = boardImpl.getGridElement(row, 2)
        assertTrue(piece is Bishop)

        piece = boardImpl.getGridElement(row, 3)
        assertTrue(piece is King)

        piece = boardImpl.getGridElement(row, 4)
        assertTrue(piece is Queen)

        piece = boardImpl.getGridElement(row, 5)
        assertTrue(piece is Bishop)

        piece = boardImpl.getGridElement(row, 6)
        assertTrue(piece is Knight)

        piece = boardImpl.getGridElement(row, 7)
        assertTrue(piece is Rook)

    }
}
