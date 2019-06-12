package com.alltimeslucky.cheekychess.model.board

import com.alltimeslucky.cheekychess.model.piece.Knight
import com.alltimeslucky.cheekychess.model.piece.Piece
import com.alltimeslucky.cheekychess.model.piece.PieceFactoryImpl
import com.alltimeslucky.cheekychess.model.piece.Rook
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

        piece = boardImpl.getGridElement(0, 1)
        assertTrue(piece is Knight)

    }
}
