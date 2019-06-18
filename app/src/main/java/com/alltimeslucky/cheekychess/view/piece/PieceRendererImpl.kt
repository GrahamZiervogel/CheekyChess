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
import com.alltimeslucky.cheekychess.model.piece.Piece

class PieceRendererImpl(context: Context) : PieceRenderer {

    private val imageView = ImageView(context)

    override fun draw(piece: Piece?, constraintLayout: ConstraintLayout) {
        imageView.setImageResource(R.drawable.pawn_gold)
        constraintLayout.addView(imageView)
    }

}
