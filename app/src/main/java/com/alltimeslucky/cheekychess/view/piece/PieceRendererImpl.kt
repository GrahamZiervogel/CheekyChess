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

        val imageView = ImageView(context)

        if (piece != null) {
            if (piece.colour == Colour.BLACK) {
                when (piece) {
                    is Pawn -> imageView.setImageResource(R.drawable.pawn_gold)
                    is Rook -> imageView.setImageResource(R.drawable.rook_gold)
                    is Knight -> imageView.setImageResource(R.drawable.knight_gold)
                    is Bishop -> imageView.setImageResource(R.drawable.bishop_gold)
                    is Queen -> imageView.setImageResource(R.drawable.queen_gold)
                    is King -> imageView.setImageResource(R.drawable.king_gold)
                }
            } else if (piece.colour == Colour.WHITE) {
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

            val boardSquareSideLength = coordinateMapper.getBoardSquareSideLength().toInt()
            imageView.layoutParams.height = boardSquareSideLength
            imageView.layoutParams.width = boardSquareSideLength

            val pixelCoordinates = coordinateMapper.mapGridCoordinatesToPixelCoordinates(gridCoordinates)
            imageView.x = pixelCoordinates.second
            imageView.y = pixelCoordinates.first

        }

    }

}
