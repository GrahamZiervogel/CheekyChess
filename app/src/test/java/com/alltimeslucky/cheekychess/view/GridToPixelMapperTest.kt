/*
 * Copyright (c) All Times Lucky. All rights reserved.
 * Licensed under the GNU Lesser General Public License v3.0. See LICENCE file in the project root for full licence information.
 *
 */

package com.alltimeslucky.cheekychess.view

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import kotlin.properties.Delegates

class GridToPixelMapperTest {

    private var gridToPixelMapper: GridToPixelMapper by Delegates.notNull()

    @Before
    fun setup() {
        gridToPixelMapper = GridToPixelMapper()
    }

    @Test
    fun mapGridIndicesToStartPixels_shouldMapGridIndicesToZeroWhenNotInitialized() {

        val (pixelX, pixelY) = gridToPixelMapper.mapGridIndicesToStartPixels(0, 0)

        assertEquals(pixelX, 0F)
        assertEquals(pixelY, 0F)

    }

    @Test
    fun mapGridIndicesToStartPixels_shouldMapGridIndicesToStartPixels() {

        gridToPixelMapper.layoutHeight = 1584
        gridToPixelMapper.layoutWidth = 1080

        val (pixelX, pixelY) = gridToPixelMapper.mapGridIndicesToStartPixels(4, 5)

        assertEquals(675F, pixelX)
        assertEquals(792F, pixelY)

    }

    @Test
    fun getBoardSquareDimensions_shouldReturnBoardSquareDimensions() {

        gridToPixelMapper.layoutHeight = 1584
        gridToPixelMapper.layoutWidth = 1080

        val (squareHeight, squareWidth) = gridToPixelMapper.getBoardSquareDimensions()

        assertEquals(135F, squareHeight)
        assertEquals(135F, squareWidth)

    }

}
