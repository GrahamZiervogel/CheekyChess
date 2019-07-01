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
import com.alltimeslucky.cheekychess.view.CoordinateMapper


class PieceRendererImpl(private val context: Context, private val coordinateMapper: CoordinateMapper) :
    PieceRenderer {

    override fun draw(constraintLayout: ConstraintLayout, gridCoordinates: Pair<Int, Int>, piece: Piece?) {

        val pieceImageView = ImageView(context)

        if (piece != null) {
            if (piece.colour == Colour.BLACK) {
                when (piece) {
                    is Pawn -> pieceImageView.setImageResource(R.drawable.pawn_gold)
                    is Rook -> pieceImageView.setImageResource(R.drawable.rook_gold)
                    is Knight -> pieceImageView.setImageResource(R.drawable.knight_gold)
                    is Bishop -> pieceImageView.setImageResource(R.drawable.bishop_gold)
                    is Queen -> pieceImageView.setImageResource(R.drawable.queen_gold)
                    is King -> pieceImageView.setImageResource(R.drawable.king_gold)
                }
            } else if (piece.colour == Colour.WHITE) {
                when (piece) {
                    is Pawn -> pieceImageView.setImageResource(R.drawable.pawn_green)
                    is Rook -> pieceImageView.setImageResource(R.drawable.rook_green)
                    is Knight -> pieceImageView.setImageResource(R.drawable.knight_green)
                    is Bishop -> pieceImageView.setImageResource(R.drawable.bishop_green)
                    is Queen -> pieceImageView.setImageResource(R.drawable.queen_green)
                    is King -> pieceImageView.setImageResource(R.drawable.king_green)
                }
            }

            constraintLayout.addView(pieceImageView)

            val boardSquareSideLength = coordinateMapper.getBoardSquareSideLength().toInt()
            pieceImageView.layoutParams.height = boardSquareSideLength
            pieceImageView.layoutParams.width = boardSquareSideLength

            val pixelCoordinates = coordinateMapper.mapGridCoordinatesToPixelCoordinates(gridCoordinates)
            pieceImageView.x = pixelCoordinates.second
            pieceImageView.y = pixelCoordinates.first

        }

    }

}
