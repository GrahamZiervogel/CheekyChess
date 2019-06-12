package com.alltimeslucky.cheekychess.model.board

import com.alltimeslucky.cheekychess.model.piece.*

class BoardImpl(private val pieceFactory: PieceFactory) : Board {

    private var pieceGrid = Array<Array<Piece?>>(HEIGHT) {
        Array(WIDTH) { null }
    }

    override fun initializeGrid() {

        var row = 0
        pieceGrid[row][0] = pieceFactory.getRook()
        pieceGrid[row][1] = pieceFactory.getKnight()
        pieceGrid[row][2] = pieceFactory.getBishop()
        pieceGrid[row][3] = pieceFactory.getQueen()
        pieceGrid[row][4] = pieceFactory.getKing()
        pieceGrid[row][5] = pieceFactory.getBishop()
        pieceGrid[row][6] = pieceFactory.getKnight()
        pieceGrid[row][7] = pieceFactory.getRook()

        row = 1
        for (column in 0 until WIDTH) {
            pieceGrid[row][column] = Pawn()
        }

        row = 6
        for (column in 0 until WIDTH) {
            pieceGrid[row][column] = Pawn()
        }

        row = 7
        pieceGrid[row][0] = pieceFactory.getRook()
        pieceGrid[row][1] = pieceFactory.getKnight()
        pieceGrid[row][2] = pieceFactory.getBishop()
        pieceGrid[row][3] = pieceFactory.getKing()
        pieceGrid[row][4] = pieceFactory.getQueen()
        pieceGrid[row][5] = pieceFactory.getBishop()
        pieceGrid[row][6] = pieceFactory.getKnight()
        pieceGrid[row][7] = pieceFactory.getRook()

    }

    override fun printGrid() {
        for (height in 0 until HEIGHT) {
            for (width in 0 until WIDTH) {
                print(pieceGrid[height][width])
            }
            println()
        }
    }

    fun getGridElement(row: Int, column: Int): Piece? {
        return pieceGrid[row][column]
    }

    fun getGridWidth(): Int {
        return WIDTH
    }

    companion object {
        private const val HEIGHT = 8
        private const val WIDTH = 8
    }

}
