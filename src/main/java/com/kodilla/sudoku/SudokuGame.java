package com.kodilla.sudoku;

public class SudokuGame {
        private static java.util.Scanner scanner = new java.util.Scanner(System.in);

        public boolean resolveSudoku() {

            if(scanner.hasNext("Sudoku")){
                // TODO: method resolving whole sudoku
                return true;
            }
            else return false;
        }

        public void playerChoice() {
            System.out.println("Wybierz swój ruch!");
            SudokuBoard.setValueToField(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        }
}
