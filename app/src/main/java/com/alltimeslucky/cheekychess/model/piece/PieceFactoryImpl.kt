package com.alltimeslucky.cheekychess.model.piece

class PieceFactoryImpl : PieceFactory {

    override fun getBishop(): Bishop {
        return Bishop()
    }

    override fun getKing(): King {
        return King()
    }

    override fun getKnight(): Knight {
        return Knight()
    }

    override fun getPawn(): Pawn {
        return Pawn()
    }

    override fun getQueen(): Queen {
        return Queen()
    }

    override fun getRook(): Rook {
        return Rook()
    }

}
