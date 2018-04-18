package com.kodilla.sudoku;

import java.util.ArrayList;


public class SudokuRow {
    private final ArrayList<SudokuElement> sudokuRow = new ArrayList<>();

    public SudokuRow() {
        for(int i = 0; i <= 9; i++) {
            sudokuRow.add(i, new SudokuElement());
        }
    }

    public ArrayList<SudokuElement> getSudokuRow() {
        return sudokuRow;
    }

    @Override
    public String toString() {
        return "SudokuRow{" +
                "sudokuRow=" + sudokuRow +
                '}';
    }
}
