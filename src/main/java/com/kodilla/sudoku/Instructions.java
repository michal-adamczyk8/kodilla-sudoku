package com.kodilla.sudoku;

public class Instructions {
    SudokuBoard sudokuBoard;

    public static void setValueToCell(int row, int column, int value) {
        SudokuBoard.getRows().get(row).getSudokuRow().get(column).setValue(value);
    }

    public static int getValue(int row, int column) {
        int value = SudokuBoard.getRows().get(row).getSudokuRow().get(column).getValue();
        return value;
    }



}
