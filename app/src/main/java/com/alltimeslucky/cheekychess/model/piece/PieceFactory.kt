/*
 * Copyright (c) All Times Lucky. All rights reserved.
 * Licensed under the GNU Lesser General Public License v3.0. See LICENCE file in the project root for full licence information.
 *
 */

package com.alltimeslucky.cheekychess.model.piece

interface PieceFactory {

    fun makeNewBishop(): Bishop
    fun makeNewKing(): King
    fun makeNewKnight(): Knight
    fun makeNewPawn(): Pawn
    fun makeNewQueen(): Queen
    fun makeNewRook(): Rook

}
