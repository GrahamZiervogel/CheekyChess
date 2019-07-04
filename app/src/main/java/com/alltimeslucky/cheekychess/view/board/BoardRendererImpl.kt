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
import com.alltimeslucky.cheekychess.model.selection.Selection
import com.alltimeslucky.cheekychess.view.CoordinateMapper
import com.alltimeslucky.cheekychess.view.piece.PieceRenderer

class BoardRendererImpl(
    context: Context,
    private val pieceRenderer: PieceRenderer,
    private val coordinateMapper: CoordinateMapper,
    private val selection: Selection
) : BoardRenderer {

    private val boardImageView = ImageView(context)
    private val highlightImageView = ImageView(context)

    init {
        boardImageView.setImageResource(R.drawable.board)
        highlightImageView.setImageResource(R.drawable.square_highlighter)
    }

    override fun draw(board: Board, constraintLayout: ConstraintLayout) {

        constraintLayout.removeAllViews()
        constraintLayout.addView(boardImageView)

        for (rowIter in 0 until 8) {
            for (colIter in 0 until 8) {

                val gridCoordinates = Pair(rowIter, colIter)
                val piece = board.getGridElement(gridCoordinates)

                pieceRenderer.draw(constraintLayout, gridCoordinates, piece)

            }
        }

        val selectedGridLocation: Pair<Int, Int>? = selection.get()

        if (selectedGridLocation != null) {

            val boardSquareSideLength = coordinateMapper.getBoardSquareSideLength().toInt()
            val pixelCoordinates = coordinateMapper.mapGridCoordinatesToPixelCoordinates(selectedGridLocation)

            constraintLayout.addView(highlightImageView)

            highlightImageView.layoutParams.height = boardSquareSideLength
            highlightImageView.layoutParams.width = boardSquareSideLength

            highlightImageView.x = pixelCoordinates.second
            highlightImageView.y = pixelCoordinates.first

        }

    }

}
