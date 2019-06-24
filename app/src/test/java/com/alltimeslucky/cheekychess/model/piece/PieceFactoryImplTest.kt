/*
 * Copyright (c) All Times Lucky. All rights reserved.
 * Licensed under the GNU Lesser General Public License v3.0. See LICENCE file in the project root for full licence information.
 *
 */

package com.alltimeslucky.cheekychess.model.piece

import org.junit.Assert.assertNotSame
import org.junit.Assert.assertTrue
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
    fun makeNewBishop_shouldReturnRook() {

        val bishop: Piece = pieceFactoryImpl.makeNewBishop()

        assertTrue(bishop is Bishop)

    }

    @Test
    fun makeNewBishop_shouldReturnNewBishop() {

        val bishop1 = pieceFactoryImpl.makeNewBishop()
        val bishop2 = pieceFactoryImpl.makeNewBishop()

        assertNotSame(bishop1, bishop2)

    }

    @Test
    fun makeNewKing_shouldReturnKing() {

        val king: Piece = pieceFactoryImpl.makeNewKing()

        assertTrue(king is King)

    }

    @Test
    fun makeNewKing_shouldReturnNewKing() {

        val king1 = pieceFactoryImpl.makeNewKing()
        val king2 = pieceFactoryImpl.makeNewKing()

        assertNotSame(king1, king2)

    }

    @Test
    fun makeNewKnight_shouldReturnKnight() {

        val knight: Piece = pieceFactoryImpl.makeNewKnight()

        assertTrue(knight is Knight)

    }

    @Test
    fun makeNewKnight_shouldReturnNewKnight() {

        val knight1 = pieceFactoryImpl.makeNewKnight()
        val knight2 = pieceFactoryImpl.makeNewKnight()

        assertNotSame(knight1, knight2)

    }

    @Test
    fun makeNewPawn_shouldReturnPawn() {

        val pawn: Piece = pieceFactoryImpl.makeNewPawn()

        assertTrue(pawn is Pawn)

    }

    @Test
    fun makeNewPawn_shouldReturnNewPawn() {

        val pawn1 = pieceFactoryImpl.makeNewPawn()
        val pawn2 = pieceFactoryImpl.makeNewPawn()

        assertNotSame(pawn1, pawn2)

    }

    @Test
    fun makeNewQueen_shouldReturnQueen() {

        val queen: Piece = pieceFactoryImpl.makeNewQueen()

        assertTrue(queen is Queen)

    }

    @Test
    fun makeNewQueen_shouldReturnNewQueen() {

        val queen1 = pieceFactoryImpl.makeNewQueen()
        val queen2 = pieceFactoryImpl.makeNewQueen()

        assertNotSame(queen1, queen2)

    }

    @Test
    fun makeNewRook_shouldReturnRook() {

        val rook: Piece = pieceFactoryImpl.makeNewRook()

        assertTrue(rook is Rook)

    }

    @Test
    fun makeNewRook_shouldReturnNewRook() {

        val rook1 = pieceFactoryImpl.makeNewRook()
        val rook2 = pieceFactoryImpl.makeNewRook()

        assertNotSame(rook1, rook2)

    }

}
