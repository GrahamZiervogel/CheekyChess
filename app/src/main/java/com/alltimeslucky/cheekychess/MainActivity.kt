/*
 * Copyright (c) All Times Lucky. All rights reserved.
 * Licensed under the GNU Lesser General Public License v3.0. See LICENCE file in the project root for full licence information.
 *
 */

package com.alltimeslucky.cheekychess

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v7.app.AppCompatActivity
import android.view.MotionEvent
import android.view.ViewTreeObserver.OnGlobalLayoutListener
import com.alltimeslucky.cheekychess.controller.SelectionController
import com.alltimeslucky.cheekychess.koin.Module
import com.alltimeslucky.cheekychess.model.board.Board
import com.alltimeslucky.cheekychess.view.CoordinateMapper
import com.alltimeslucky.cheekychess.view.board.BoardRenderer
import org.koin.android.ext.android.inject
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin


class MainActivity : AppCompatActivity() {

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        startKoin {
            androidLogger()
            androidContext(this@MainActivity)
            modules(Module.appModule)
        }

        setContentView(R.layout.activity_main)

        val board: Board by inject()
        board.initializeGrid()

        val boardRenderer: BoardRenderer by inject()
        val constraintLayout = findViewById<ConstraintLayout>(R.id.mainLayout)

        val coordinateMapper: CoordinateMapper by inject()
        val selectionController: SelectionController by inject()

        constraintLayout.setOnTouchListener { _, motionEvent ->

            if (motionEvent.action == MotionEvent.ACTION_DOWN) {

                val layoutPixelColumn = motionEvent.x
                val layoutPixelRow = motionEvent.y

                selectionController.select(Pair(layoutPixelRow, layoutPixelColumn))
                boardRenderer.draw(board, constraintLayout)

            }

            true

        }

        val vto = constraintLayout.viewTreeObserver

        vto.addOnGlobalLayoutListener(
            object : OnGlobalLayoutListener {
                override fun onGlobalLayout() {

                    constraintLayout.viewTreeObserver.removeOnGlobalLayoutListener(this)

                    val layoutHeight: Int = constraintLayout.measuredHeight
                    val layoutWidth: Int = constraintLayout.measuredWidth

                    coordinateMapper.layoutHeight = layoutHeight
                    coordinateMapper.layoutWidth = layoutWidth

                    boardRenderer.draw(board, constraintLayout)

                }
            }
        )

    }

}
