package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class ResolveSudoku {
    public static SudokuBoard sudokuBoard;

    public static ArrayList<SudokuElement> getRow(int rowNumber) {
        return sudokuBoard.getRows().get(rowNumber).getSudokuRow();
    }

    public static List<SudokuElement> getColumn(int columnNumber) {
        List<SudokuElement> columnsValue = new ArrayList<>();
        for(int i = 0; i < sudokuBoard.getRows().size(); i++) {
            columnsValue.add(sudokuBoard.getRows().get(i).getSudokuRow().get(columnNumber));
        }
        return columnsValue;
    }

    public static SudokuElement getSudokuElementFromRow(int rowNumber, int elementNumber) {
          return getRow(rowNumber).get(elementNumber);
    }

    public static SudokuElement getSudokuElementFromColumn(int columnNumber, int elementNumber) {
        return  getColumn(columnNumber).get(elementNumber);
    }

    public static SudokuElement getSudokuElemntFromSquare(int square, int elementNumber) {

    }

    public static void checkRows() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                for (int k = 0; k < getSudokuElementFromRow(i, j).getPossibleAnswers().size(); k++) {
                    int possibleValue = getSudokuElementFromRow(i, j).getPossibleAnswers().get(k);
                    for (int l = 0; l < 9; l++) {
                        if (possibleValue == getSudokuElementFromRow(i, l).getValue()) {
                            getSudokuElementFromRow(i, j).getPossibleAnswers().remove(possibleValue);
                        }
                    }
                    if (getSudokuElementFromRow(i, j).getPossibleAnswers().size() == 1) {
                        getSudokuElementFromRow(i, j).setValue(getSudokuElementFromRow(i, j).getPossibleAnswers().get(0));
                    } else {
//                        TODO: Method throws an exception
                    }
                }
            }
        }
    }

    public static void checkColumns() {
        for (int q = 0; q < 9; q++) {
            for (int w = 0; w < 9; w++) {
                for (int e = 0; e < getSudokuElementFromColumn(q, w).getPossibleAnswers().size(); e++) {
                    int possibleValue = getSudokuElementFromColumn(q, w).getPossibleAnswers().get(e);
                    for (int r = 0; r < 9; r++) {
                        if (possibleValue == getSudokuElementFromColumn(q, w).getValue()) {
                            getSudokuElementFromColumn(q, w).getPossibleAnswers().remove(possibleValue);
                        }
                    if (getSudokuElementFromColumn(q, w).getPossibleAnswers().size() == 1) {
                        getSudokuElementFromColumn(q, w).setValue(
                                getSudokuElementFromColumn(q, w).getPossibleAnswers().get(0));
                    } else {
                        //TODO: Method throws an exception
                    }
                }
            }
        }
    }

    public static void checkSquares(int squareNumber, int value) {
        int[]start_Rows_Index_Tab = new int[]{0, 0, 0, 3, 3, 3, 6, 6, 6};
        int startRow = start_Rows_Index_Tab[squareNumber];
        int endRow = startRow + 3;
        int startColumn = (squareNumber % 3) * 3;
        int endColumn = startColumn + 3;

        for(; startRow < endRow; startRow++) {
            for(; startColumn < endColumn; startColumn++) {
                //Poprawić metodę wywoluącą sudokuelemnt
                for (int j = 0; j < getSudokuElementFromColumn(startColumn, startRow).getPossibleAnswers().size(); j++) {
                    int possibleValue = getSudokuElementFromColumn(startColumn, startRow).getPossibleAnswers().get(j);
                    for (int k = 0; k < )
                }
            }
        }
    }
}
