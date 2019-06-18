/*
 * Copyright (c) All Times Lucky. All rights reserved.
 * Licensed under the GNU Lesser General Public License v3.0. See LICENCE file in the project root for full licence information.
 *
 */

package com.alltimeslucky.cheekychess.view.board

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.widget.ImageView
import com.alltimeslucky.cheekychess.R
import com.alltimeslucky.cheekychess.model.board.Board
import com.alltimeslucky.cheekychess.view.piece.PieceRenderer

class BoardRendererImpl(context: Context, private val pieceRenderer: PieceRenderer) : BoardRenderer {

    private val imageView = ImageView(context)

    override fun draw(board: Board, constraintLayout: ConstraintLayout) {
        imageView.setImageResource(R.drawable.chessboard)
        constraintLayout.addView(imageView)

        pieceRenderer.draw(board.getGridElement(0, 0), constraintLayout)
    }

}
