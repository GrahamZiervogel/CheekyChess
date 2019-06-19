/*
 * Copyright (c) All Times Lucky. All rights reserved.
 * Licensed under the GNU Lesser General Public License v3.0. See LICENCE file in the project root for full licence information.
 *
 */

package com.alltimeslucky.cheekychess.view.piece

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.widget.ImageView
import com.alltimeslucky.cheekychess.R
import com.alltimeslucky.cheekychess.model.piece.*

class PieceRendererImpl(private val context: Context) : PieceRenderer {

    override fun draw(piece: Piece?, constraintLayout: ConstraintLayout, pieceRow: Int, pieceCol: Int) {

        val imageView = ImageView(context)

        if (piece != null) {
            if (pieceRow < 4) {
                when (piece) {
                    is Pawn -> imageView.setImageResource(R.drawable.pawn_gold)
                    is Rook -> imageView.setImageResource(R.drawable.rook_gold)
                    is Knight -> imageView.setImageResource(R.drawable.knight_gold)
                    is Bishop -> imageView.setImageResource(R.drawable.bishop_gold)
                    is Queen -> imageView.setImageResource(R.drawable.queen_gold)
                    is King -> imageView.setImageResource(R.drawable.king_gold)
                }
            } else {
                when (piece) {
                    is Pawn -> imageView.setImageResource(R.drawable.pawn_green)
                    is Rook -> imageView.setImageResource(R.drawable.rook_green)
                    is Knight -> imageView.setImageResource(R.drawable.knight_green)
                    is Bishop -> imageView.setImageResource(R.drawable.bishop_green)
                    is Queen -> imageView.setImageResource(R.drawable.queen_green)
                    is King -> imageView.setImageResource(R.drawable.king_green)
                }
            }

            constraintLayout.addView(imageView)

            imageView.layoutParams.height = 120
            imageView.layoutParams.width = 120
            imageView.x = 145F + 95 * pieceCol
            imageView.y = 390F + 95 * pieceRow

        }

    }

}
