/*
 * Copyright (c) All Times Lucky. All rights reserved.
 * Licensed under the GNU Lesser General Public License v3.0. See LICENCE file in the project root for full licence information.
 *
 */

package com.alltimeslucky.cheekychess.model.piece

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import kotlin.properties.Delegates

class PieceFactoryImplTest {

    private var pieceFactoryImpl: PieceFactoryImpl by Delegates.notNull()

    @Before
    fun setup() {
        pieceFactoryImpl = PieceFactoryImpl()
    }

    @Test
    fun makeNewWhiteBishop_shouldReturnWhiteBishop() {

        val bishop: Piece = pieceFactoryImpl.makeNewWhiteBishop()

        assertTrue(bishop is Bishop)
        assertEquals(Colour.WHITE, bishop.colour)

    }

    @Test
    fun makeNewWhiteBishop_shouldReturnNewWhiteBishop() {

        val bishop1 = pieceFactoryImpl.makeNewWhiteBishop()
        val bishop2 = pieceFactoryImpl.makeNewWhiteBishop()

        assertNotSame(bishop1, bishop2)

    }

    @Test
    fun makeNewWhiteKing_shouldReturnWhiteKing() {

        val king: Piece = pieceFactoryImpl.makeNewWhiteKing()

        assertTrue(king is King)
        assertEquals(Colour.WHITE, king.colour)

    }

    @Test
    fun makeNewWhiteKing_shouldReturnNewWhiteKing() {

        val king1 = pieceFactoryImpl.makeNewWhiteKing()
        val king2 = pieceFactoryImpl.makeNewWhiteKing()

        assertNotSame(king1, king2)

    }

    @Test
    fun makeNewWhiteKnight_shouldReturnWhiteKnight() {

        val knight: Piece = pieceFactoryImpl.makeNewWhiteKnight()

        assertTrue(knight is Knight)
        assertEquals(Colour.WHITE, knight.colour)

    }

    @Test
    fun makeNewWhiteKnight_shouldReturnNewWhiteKnight() {

        val knight1 = pieceFactoryImpl.makeNewWhiteKnight()
        val knight2 = pieceFactoryImpl.makeNewWhiteKnight()

        assertNotSame(knight1, knight2)

    }

    @Test
    fun makeNewWhitePawn_shouldReturnWhitePawn() {

        val pawn: Piece = pieceFactoryImpl.makeNewWhitePawn()

        assertTrue(pawn is Pawn)
        assertEquals(Colour.WHITE, pawn.colour)


    }

    @Test
    fun makeNewWhitePawn_shouldReturnNewWhitePawn() {

        val pawn1 = pieceFactoryImpl.makeNewWhitePawn()
        val pawn2 = pieceFactoryImpl.makeNewWhitePawn()

        assertNotSame(pawn1, pawn2)

    }

    @Test
    fun makeNewWhiteQueen_shouldReturnWhiteQueen() {

        val queen: Piece = pieceFactoryImpl.makeNewWhiteQueen()

        assertTrue(queen is Queen)
        assertEquals(Colour.WHITE, queen.colour)

    }

    @Test
    fun makeNewWhiteQueen_shouldReturnNewWhiteQueen() {

        val queen1 = pieceFactoryImpl.makeNewWhiteQueen()
        val queen2 = pieceFactoryImpl.makeNewWhiteQueen()

        assertNotSame(queen1, queen2)

    }

    @Test
    fun makeNewWhiteRook_shouldReturnWhiteRook() {

        val rook: Piece = pieceFactoryImpl.makeNewWhiteRook()

        assertTrue(rook is Rook)
        assertEquals(Colour.WHITE, rook.colour)

    }

    @Test
    fun makeNewWhiteRook_shouldReturnNewWhiteRook() {

        val rook1 = pieceFactoryImpl.makeNewWhiteRook()
        val rook2 = pieceFactoryImpl.makeNewWhiteRook()

        assertNotSame(rook1, rook2)

    }

    @Test
    fun makeNewBlackBishop_shouldReturnBlackBishop() {

        val bishop: Piece = pieceFactoryImpl.makeNewBlackBishop()

        assertTrue(bishop is Bishop)
        assertEquals(Colour.BLACK, bishop.colour)

    }

    @Test
    fun makeNewBlackBishop_shouldReturnNewBlackBishop() {

        val bishop1 = pieceFactoryImpl.makeNewBlackBishop()
        val bishop2 = pieceFactoryImpl.makeNewBlackBishop()

        assertNotSame(bishop1, bishop2)

    }

    @Test
    fun makeNewBlackKing_shouldReturnBlackKing() {

        val king: Piece = pieceFactoryImpl.makeNewBlackKing()

        assertTrue(king is King)
        assertEquals(Colour.BLACK, king.colour)

    }

    @Test
    fun makeNewBlackKing_shouldReturnNewBlackKing() {

        val king1 = pieceFactoryImpl.makeNewBlackKing()
        val king2 = pieceFactoryImpl.makeNewBlackKing()

        assertNotSame(king1, king2)

    }

    @Test
    fun makeNewBlackKnight_shouldReturnBlackKnight() {

        val knight: Piece = pieceFactoryImpl.makeNewBlackKnight()

        assertTrue(knight is Knight)
        assertEquals(Colour.BLACK, knight.colour)

    }

    @Test
    fun makeNewBlackKnight_shouldReturnNewBlackKnight() {

        val knight1 = pieceFactoryImpl.makeNewBlackKnight()
        val knight2 = pieceFactoryImpl.makeNewBlackKnight()

        assertNotSame(knight1, knight2)

    }

    @Test
    fun makeNewBlackPawn_shouldReturnBlackPawn() {

        val pawn: Piece = pieceFactoryImpl.makeNewBlackPawn()

        assertTrue(pawn is Pawn)
        assertEquals(Colour.BLACK, pawn.colour)


    }

    @Test
    fun makeNewBlackPawn_shouldReturnNewBlackPawn() {

        val pawn1 = pieceFactoryImpl.makeNewBlackPawn()
        val pawn2 = pieceFactoryImpl.makeNewBlackPawn()

        assertNotSame(pawn1, pawn2)

    }

    @Test
    fun makeNewBlackQueen_shouldReturnBlackQueen() {

        val queen: Piece = pieceFactoryImpl.makeNewBlackQueen()

        assertTrue(queen is Queen)
        assertEquals(Colour.BLACK, queen.colour)

    }

    @Test
    fun makeNewBlackQueen_shouldReturnNewBlackQueen() {

        val queen1 = pieceFactoryImpl.makeNewBlackQueen()
        val queen2 = pieceFactoryImpl.makeNewBlackQueen()

        assertNotSame(queen1, queen2)

    }

    @Test
    fun makeNewBlackRook_shouldReturnBlackRook() {

        val rook: Piece = pieceFactoryImpl.makeNewBlackRook()

        assertTrue(rook is Rook)
        assertEquals(Colour.BLACK, rook.colour)

    }

    @Test
    fun makeNewBlackRook_shouldReturnNewBlackRook() {

        val rook1 = pieceFactoryImpl.makeNewBlackRook()
        val rook2 = pieceFactoryImpl.makeNewBlackRook()

        assertNotSame(rook1, rook2)

    }

}
