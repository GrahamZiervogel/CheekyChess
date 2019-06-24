/*
 * Copyright (c) All Times Lucky. All rights reserved.
 * Licensed under the GNU Lesser General Public License v3.0. See LICENCE file in the project root for full licence information.
 *
 */

package com.alltimeslucky.cheekychess.koin

import com.alltimeslucky.cheekychess.model.board.Board
import com.alltimeslucky.cheekychess.model.board.BoardImpl
import com.alltimeslucky.cheekychess.model.piece.PieceFactory
import com.alltimeslucky.cheekychess.model.piece.PieceFactoryImpl
import com.alltimeslucky.cheekychess.view.GridToPixelMapper
import com.alltimeslucky.cheekychess.view.board.BoardRenderer
import com.alltimeslucky.cheekychess.view.board.BoardRendererImpl
import com.alltimeslucky.cheekychess.view.piece.PieceRenderer
import com.alltimeslucky.cheekychess.view.piece.PieceRendererImpl
import org.koin.dsl.module

class Module {

    companion object {

        val appModule = module {

            single<Board> { BoardImpl(get()) }
            single<BoardRenderer> { BoardRendererImpl(get(), get()) }
            single { GridToPixelMapper() }
            single<PieceFactory> { PieceFactoryImpl() }
            single<PieceRenderer> { PieceRendererImpl(get(), get()) }

        }

    }

}
