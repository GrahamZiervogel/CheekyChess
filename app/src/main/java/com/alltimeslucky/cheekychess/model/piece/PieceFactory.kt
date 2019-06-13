package com.alltimeslucky.cheekychess.model.piece

interface PieceFactory {

    fun makeNewBishop(): Bishop
    fun makeNewKing(): King
    fun makeNewKnight(): Knight
    fun makeNewPawn(): Pawn
    fun makeNewQueen(): Queen
    fun makeNewRook(): Rook

}
