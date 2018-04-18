package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.Arrays;

public class SudokuElement {
    private static final int EMPTY = -1;

    private int value;


    private ArrayList<Integer> possibleAnswers;

    public SudokuElement() {
        this.value = EMPTY;
        this.possibleAnswers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public ArrayList<Integer> getPossibleAnswers() {
        return possibleAnswers;
    }

    public void setPossibleAnswers(ArrayList<Integer> possibleAnswers) {
        this.possibleAnswers = possibleAnswers;
    }
}
