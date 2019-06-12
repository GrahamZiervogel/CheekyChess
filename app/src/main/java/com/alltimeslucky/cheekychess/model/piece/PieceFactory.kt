package com.alltimeslucky.cheekychess.model.piece

interface PieceFactory {

    fun getBishop(): Bishop
    fun getKing(): King
    fun getKnight(): Knight
    fun getPawn(): Pawn
    fun getQueen(): Queen
    fun getRook(): Rook

}
