/*
 * Copyright (c) All Times Lucky. All rights reserved.
 * Licensed under the GNU Lesser General Public License v3.0. See LICENCE file in the project root for full licence information.
 *
 */

package com.alltimeslucky.cheekychess.model.piece

class PieceFactoryImpl : PieceFactory {

    override fun makeNewWhiteBishop(): Bishop {
        return Bishop(COLOUR.WHITE)
    }

    override fun makeNewWhiteKing(): King {
        return King(COLOUR.WHITE)
    }

    override fun makeNewWhiteKnight(): Knight {
        return Knight(COLOUR.WHITE)
    }

    override fun makeNewWhitePawn(): Pawn {
        return Pawn(COLOUR.WHITE)
    }

    override fun makeNewWhiteQueen(): Queen {
        return Queen(COLOUR.WHITE)
    }

    override fun makeNewWhiteRook(): Rook {
        return Rook(COLOUR.WHITE)
    }

    override fun makeNewBlackBishop(): Bishop {
        return Bishop(COLOUR.BLACK)
    }

    override fun makeNewBlackKing(): King {
        return King(COLOUR.BLACK)
    }

    override fun makeNewBlackKnight(): Knight {
        return Knight(COLOUR.BLACK)
    }

    override fun makeNewBlackPawn(): Pawn {
        return Pawn(COLOUR.BLACK)
    }

    override fun makeNewBlackQueen(): Queen {
        return Queen(COLOUR.BLACK)
    }

    override fun makeNewBlackRook(): Rook {
        return Rook(COLOUR.BLACK)
    }

}
