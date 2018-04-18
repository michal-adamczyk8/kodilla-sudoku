package com.kodilla.sudoku;

import java.util.ArrayList;

public class SudokuBoard {
    private static ArrayList<SudokuRow> rows = new ArrayList<>();

    public SudokuBoard() {
        for(int i = 0; i <= 9; i++){
            rows.add(i, new SudokuRow());
        }
    }

    public static ArrayList<SudokuRow> getRows() {
        return rows;
    }

    public static void setValueToField(int row, int column, int value) {
        try {
            rows.get(row - 1).getSudokuRow().get(column - 1).setValue(value);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Wybór nieparawidłowy! Wybierz jeszce raz!");
        }

    }

    @Override
    public String toString() {
        StringBuilder printBoard = new StringBuilder("   1   2   3   4   5   6   7   8   9" + "\n");
        for(int i = 0; i < 9; i++) {
            printBoard.append(1 + i).append("|");
            for (int n = 0; n < 9; n++) {
                if (getRows().get(i).getSudokuRow().get(n).getValue() == -1) {
                    printBoard.append(" - ");
                }
                else {
                    printBoard.append(" ");
                    printBoard.append(getRows().get(i).getSudokuRow().get(n).getValue());
                    printBoard.append(" ");
                }
                printBoard.append("|");
            }
            printBoard.append("\n");
        }
        return printBoard.toString();


    }
}