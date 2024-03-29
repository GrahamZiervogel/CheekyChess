/*
 * Copyright (c) All Times Lucky. All rights reserved.
 * Licensed under the GNU Lesser General Public License v3.0. See LICENCE file in the project root for full licence information.
 *
 */

package com.alltimeslucky.cheekychess.model.selection

interface Selection {

    fun get(): Pair<Int, Int>?
    fun set(gridCoordinates: Pair<Int, Int>)

}
