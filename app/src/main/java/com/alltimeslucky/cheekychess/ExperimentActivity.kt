package com.alltimeslucky.cheekychess

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.ShapeDrawable
import android.graphics.drawable.shapes.RectShape
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.alltimeslucky.cheekychess.koin.Module
import com.alltimeslucky.cheekychess.model.board.Board
import kotlinx.android.synthetic.main.activity_experiment.*
import org.koin.android.ext.android.inject
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class ExperimentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        startKoin {
            androidLogger()
            androidContext(this@ExperimentActivity)
            modules(Module.appModule)
        }

        setContentView(R.layout.activity_experiment)

        val resWidth = 1080
        val resHeight = 1920

        val bitmap: Bitmap = Bitmap.createBitmap(resWidth, resHeight, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(bitmap)
        val shapeDrawable = ShapeDrawable(RectShape())

        var left: Int
        var top: Int
        var right: Int
        var bottom: Int

        val squareWidth = resWidth / 8
        val topAndBottomExcess = (resHeight - resWidth) / 2
        var colorString: String

        for (widthIter: Int in 1..8) {
            for (heightIter in 1..8) {

                left = (widthIter - 1) * squareWidth
                top = topAndBottomExcess + (heightIter - 1) * squareWidth
                right = left + squareWidth
                bottom = top + squareWidth

                colorString = if ((widthIter + heightIter) % 2 == 0) {
                    "white"
                } else {
                    "black"
                }

                shapeDrawable.setBounds(left, top, right, bottom)
                shapeDrawable.paint.color = Color.parseColor(colorString)
                shapeDrawable.draw(canvas)

            }
        }

        experimentBoard.background = BitmapDrawable(resources, bitmap)

        val board: Board by inject()

        board.initializeGrid()
        board.printGrid()

    }

}
