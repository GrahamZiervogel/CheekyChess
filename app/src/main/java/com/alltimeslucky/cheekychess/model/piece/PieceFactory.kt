/*
 * Copyright (c) All Times Lucky. All rights reserved.
 * Licensed under the GNU Lesser General Public License v3.0. See LICENCE file in the project root for full licence information.
 *
 */

package com.alltimeslucky.cheekychess.model.piece

interface PieceFactory {

    fun makeNewWhiteBishop(): Bishop
    fun makeNewWhiteKing(): King
    fun makeNewWhiteKnight(): Knight
    fun makeNewWhitePawn(): Pawn
    fun makeNewWhiteQueen(): Queen
    fun makeNewWhiteRook(): Rook

    fun makeNewBlackBishop(): Bishop
    fun makeNewBlackKing(): King
    fun makeNewBlackKnight(): Knight
    fun makeNewBlackPawn(): Pawn
    fun makeNewBlackQueen(): Queen
    fun makeNewBlackRook(): Rook

}
