package com.alltimeslucky.cheekychess.model.piece

class PieceFactoryImpl : PieceFactory {

    override fun makeNewBishop(): Bishop {
        return Bishop()
    }

    override fun makeNewKing(): King {
        return King()
    }

    override fun makeNewKnight(): Knight {
        return Knight()
    }

    override fun makeNewPawn(): Pawn {
        return Pawn()
    }

    override fun makeNewQueen(): Queen {
        return Queen()
    }

    override fun makeNewRook(): Rook {
        return Rook()
    }

}
