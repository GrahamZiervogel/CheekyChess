/*
 * Copyright (c) All Times Lucky. All rights reserved.
 * Licensed under the GNU Lesser General Public License v3.0. See LICENCE file in the project root for full licence information.
 *
 */

package com.alltimeslucky.cheekychess

import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView

class SpriteActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_sprite)

        val constraintLayout = findViewById<ConstraintLayout>(R.id.constraintLayout)

        val imageView = ImageView(this)

        imageView.setImageResource(R.drawable.test_png)

        constraintLayout.addView(imageView)
    }
}
