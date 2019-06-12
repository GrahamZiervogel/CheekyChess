package com.alltimeslucky.cheekychess.koin

import com.alltimeslucky.cheekychess.model.board.Board
import com.alltimeslucky.cheekychess.model.board.BoardImpl
import com.alltimeslucky.cheekychess.model.piece.PieceFactory
import com.alltimeslucky.cheekychess.model.piece.PieceFactoryImpl
import org.koin.dsl.module

class Module {

    companion object {

        val appModule = module {

            single<PieceFactory> { PieceFactoryImpl() }

            single<Board> { BoardImpl(get()) }

        }

    }

}
