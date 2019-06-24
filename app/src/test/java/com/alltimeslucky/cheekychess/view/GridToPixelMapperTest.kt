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
    fun getBoardSquareSideLength_shouldReturnZeroWhenNotInitialized() {

        val boardSquareSideLength = gridToPixelMapper.getBoardSquareSideLength()

        assertEquals(0F, boardSquareSideLength)

    }

    @Test
    fun getBoardSquareSideLength_shouldReturnBoardSquareSideLength() {

        gridToPixelMapper.layoutHeight = 1584
        gridToPixelMapper.layoutWidth = 1080

        val boardSquareSideLength = gridToPixelMapper.getBoardSquareSideLength()

        assertEquals(135F, boardSquareSideLength)

    }

    @Test
    fun mapGridCoordinatesToPixelCoordinates_shouldMapGridCoordinatesToZeroWhenNotInitialized() {

        val pixelCoordinates = gridToPixelMapper.mapGridCoordinatesToPixelCoordinates(Pair(4, 5))

        assertEquals(0F, pixelCoordinates.first)
        assertEquals(0F, pixelCoordinates.second)

    }

    @Test
    fun mapGridCoordinatesToPixelCoordinates_shouldMapGridCoordinatesToPixelCoordinates() {

        gridToPixelMapper.layoutHeight = 1584
        gridToPixelMapper.layoutWidth = 1080

        val pixelCoordinates = gridToPixelMapper.mapGridCoordinatesToPixelCoordinates(Pair(4, 5))

        assertEquals(792F, pixelCoordinates.first)
        assertEquals(675F, pixelCoordinates.second)

    }

}
