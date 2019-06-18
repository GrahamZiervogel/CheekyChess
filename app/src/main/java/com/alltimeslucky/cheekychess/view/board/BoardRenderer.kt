/*
 * Copyright (c) All Times Lucky. All rights reserved.
 * Licensed under the GNU Lesser General Public License v3.0. See LICENCE file in the project root for full licence information.
 *
 */

package com.alltimeslucky.cheekychess.view.board

import android.support.constraint.ConstraintLayout
import com.alltimeslucky.cheekychess.model.board.Board

interface BoardRenderer {

    fun draw(board: Board, constraintLayout: ConstraintLayout)

}
