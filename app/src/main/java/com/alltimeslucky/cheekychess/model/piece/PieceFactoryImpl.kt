/*
 * Copyright (c) All Times Lucky. All rights reserved.
 * Licensed under the GNU Lesser General Public License v3.0. See LICENCE file in the project root for full licence information.
 *
 */

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
