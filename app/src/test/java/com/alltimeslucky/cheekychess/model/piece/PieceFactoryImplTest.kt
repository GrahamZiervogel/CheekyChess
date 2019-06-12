package com.alltimeslucky.cheekychess.model.piece

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import kotlin.properties.Delegates

@Suppress("USELESS_IS_CHECK")
class PieceFactoryImplTest {

    private var pieceFactoryImpl: PieceFactoryImpl by Delegates.notNull()

    @Before
    fun setup() {
        pieceFactoryImpl = PieceFactoryImpl()
    }

    @Test
    fun getBishop_shouldReturnRook() {

        val bishop = pieceFactoryImpl.getBishop()

        assertTrue(bishop is Bishop)
    }

    @Test
    fun getBishop_shouldReturnNewBishop() {

        val bishop1 = pieceFactoryImpl.getBishop()
        val bishop2 = pieceFactoryImpl.getBishop()

        assertNotSame(bishop1, bishop2)
    }

    @Test
    fun getKing_shouldReturnKing() {

        val king = pieceFactoryImpl.getKing()

        assertTrue(king is King)
    }

    @Test
    fun getKing_shouldReturnNewKing() {

        val king1 = pieceFactoryImpl.getKing()
        val king2 = pieceFactoryImpl.getKing()

        assertNotSame(king1, king2)
    }

    @Test
    fun getKnight_shouldReturnKnight() {

        val knight = pieceFactoryImpl.getKnight()

        assertTrue(knight is Knight)
    }

    @Test
    fun getKnight_shouldReturnNewKnight() {

        val knight1 = pieceFactoryImpl.getKnight()
        val knight2 = pieceFactoryImpl.getKnight()

        assertNotSame(knight1, knight2)
    }

    @Test
    fun getPawn_shouldReturnPawn() {

        val pawn = pieceFactoryImpl.getPawn()

        assertTrue(pawn is Pawn)
    }

    @Test
    fun getPawn_shouldReturnNewPawn() {

        val pawn1 = pieceFactoryImpl.getPawn()
        val pawn2 = pieceFactoryImpl.getPawn()

        assertNotSame(pawn1, pawn2)
    }

    @Test
    fun getQueen_shouldReturnQueen() {

        val queen = pieceFactoryImpl.getQueen()

        assertTrue(queen is Queen)
    }

    @Test
    fun getQueen_shouldReturnNewQueen() {

        val queen1 = pieceFactoryImpl.getQueen()
        val queen2 = pieceFactoryImpl.getQueen()

        assertNotSame(queen1, queen2)
    }

    @Test
    fun getRook_shouldReturnRook() {

        val rook = pieceFactoryImpl.getRook()

        assertTrue(rook is Rook)
    }

    @Test
    fun getRook_shouldReturnNewRook() {

        val rook1 = pieceFactoryImpl.getRook()
        val rook2 = pieceFactoryImpl.getRook()

        assertNotSame(rook1, rook2)
    }

}
