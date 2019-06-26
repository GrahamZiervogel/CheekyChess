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

class CoordinateMapperTest {

    private var coordinateMapper: CoordinateMapper by Delegates.notNull()

    @Before
    fun setup() {
        coordinateMapper = CoordinateMapper()
    }

    @Test
    fun getBoardSquareSideLength_shouldReturnZeroWhenNotInitialized() {

        val boardSquareSideLength = coordinateMapper.getBoardSquareSideLength()

        assertEquals(0F, boardSquareSideLength)

    }

    @Test
    fun getBoardSquareSideLength_shouldReturnBoardSquareSideLength() {

        coordinateMapper.layoutHeight = 1584
        coordinateMapper.layoutWidth = 1080

        val boardSquareSideLength = coordinateMapper.getBoardSquareSideLength()

        assertEquals(135F, boardSquareSideLength)

    }

    @Test
    fun mapGridCoordinatesToPixelCoordinates_shouldMapGridCoordinatesToZeroWhenNotInitialized() {

        val pixelCoordinates = coordinateMapper.mapGridCoordinatesToPixelCoordinates(Pair(4, 5))

        assertEquals(0F, pixelCoordinates.first)
        assertEquals(0F, pixelCoordinates.second)

    }

    @Test
    fun mapGridCoordinatesToPixelCoordinates_shouldMapGridCoordinatesToPixelCoordinates() {

        coordinateMapper.layoutHeight = 1584
        coordinateMapper.layoutWidth = 1080

        val pixelCoordinates = coordinateMapper.mapGridCoordinatesToPixelCoordinates(Pair(4, 5))

        assertEquals(792F, pixelCoordinates.first)
        assertEquals(675F, pixelCoordinates.second)

    }

}
