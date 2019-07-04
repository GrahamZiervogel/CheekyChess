/*
 * Copyright (c) All Times Lucky. All rights reserved.
 * Licensed under the GNU Lesser General Public License v3.0. See LICENCE file in the project root for full licence information.
 *
 */

package com.alltimeslucky.cheekychess.model.board

import com.alltimeslucky.cheekychess.model.piece.Piece

interface Board {

    fun getGridElement(gridCoordinates: Pair<Int, Int>): Piece?
    fun getHeight(): Int
    fun getWidth(): Int
    fun initializeGrid()
    fun isOccupied(gridCoordinates: Pair<Int, Int>): Boolean
    fun move(firstGridCoordinates: Pair<Int, Int>, secondGridCoordinates: Pair<Int, Int>): Boolean

}
