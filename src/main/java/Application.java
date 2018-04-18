import com.kodilla.sudoku.ResolveSudoku;
import com.kodilla.sudoku.SudokuBoard;
import com.kodilla.sudoku.SudokuElement;
import com.kodilla.sudoku.SudokuGame;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        SudokuBoard sudokuBoard = new SudokuBoard();
        SudokuGame theGame = new SudokuGame();
        boolean gameFinished = false;
        while(!gameFinished) {
            System.out.println(sudokuBoard.toString());
            theGame.playerChoice();
            System.out.println(sudokuBoard.toString());
            gameFinished = theGame.resolveSudoku();

        }


    }
}
