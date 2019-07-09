/*
 * Copyright (c) All Times Lucky. All rights reserved.
 * Licensed under the GNU Lesser General Public License v3.0. See LICENCE file in the project root for full licence information.
 *
 */

package com.alltimeslucky.cheekychess.model.piece

import com.alltimeslucky.cheekychess.model.board.Board

abstract class Piece {

    abstract val colour: Colour
    protected abstract val pointValue: Int

    abstract fun getPossibleMoveSquares(board: Board, gridCoordinates: Pair<Int, Int>): List<Pair<Int, Int>>

}
