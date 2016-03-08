/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

/**
 *
 * @author carlosyoung
 */
public class Homework2 {

    static Boolean found = false;
    static char[][] printPuzzle = new char[51][51];

    public static void searchForWord(String word, char puzzle[][]) {
        int currentRow = 1;
        int currentCol = 1;
        for (int row = 1; row < 51; row++) {
            for (int col = 1; col < 51; col++) {
                int pos = 0;

                if (word.charAt(pos) == puzzle[row][col]) {
                    //System.out.println(word.charAt(pos) + " was found at " + row + " " + col);
                    currentCol = col;
                    currentRow = row;
                    CheckLeft(puzzle, word.substring(++pos), currentRow, currentCol);
                    pos = 0;
                    CheckRight(puzzle, word.substring(++pos), currentRow, currentCol);
                    pos = 0;
                    CheckUp(puzzle, word.substring(++pos), currentRow, currentCol);
                    pos = 0;
                    CheckDown(puzzle, word.substring(++pos), currentRow, currentCol);
                    pos = 0;
                    CheckDiDownRight(puzzle, word.substring(++pos), currentRow, currentCol);
                    pos = 0;
                    CheckDiUpRight(puzzle, word.substring(++pos), currentRow, currentCol);
                    pos = 0;
                    CheckDiUpLeft(puzzle, word.substring(++pos), currentRow, currentCol);
                    pos = 0;
                    CheckDiDownLeft(puzzle, word.substring(++pos), currentRow, currentCol);
                    pos = 0;
                   

                    if (found == true) {
                        printPuzzle[row][col] = word.charAt(pos);
                        return;
                    }
                }
            }
        }
    }

    public static void CheckLeft(char puzzle[][], String word, int row, int col) {
        col--;
        if (col <= 1) {
            return;
        } else if (word.length() == 1) {

            if (word.charAt(0) == puzzle[row][col]) {
                //System.out.println(word.charAt(0) + " was found at " + row + " " + col);
                printPuzzle[row][col] = word.charAt(0);

                System.out.println("You've found the word");
                found = true;
                return;
            }
            return;
        } else if (word.charAt(0) == puzzle[row][col]) {
            //System.out.println(word.charAt(0) + " was found at " + row + " " + col);
            CheckLeft(puzzle, word.substring(1), row, col);
            printPuzzle[row][col] = word.charAt(0);

        } else {
            return;
        }

    }

    public static void CheckRight(char puzzle[][], String word, int row, int col) {
        col++;
        if (col >= 50) {
            return;
        } else if (word.length() == 1) {
            if (word.charAt(0) == puzzle[row][col]) {
                //System.out.println(word.charAt(0) + " was found at " + row + " " + col);
                printPuzzle[row][col] = word.charAt(0);

                System.out.println("You've found the word");
                found = true;
                return;
            }
            return;
        } else if (word.charAt(0) == puzzle[row][col]) {
            //System.out.println(word.charAt(0) + " was found at " + row + " " + col);

            CheckRight(puzzle, word.substring(1), row, col);
            printPuzzle[row][col] = word.charAt(0);

        } else {
            return;
        }
    }

    public static void CheckUp(char puzzle[][], String word, int row, int col) {
        row--;
        if (row <= 1) {
            return;
        } else if (word.length() == 1) {
            if (word.charAt(0) == puzzle[row][col]) {
                //System.out.println(word.charAt(0) + " was found at " + row + " " + col);
                printPuzzle[row][col] = word.charAt(0);

                System.out.println("You've found the word");
                found = true;
                return;
            }
            return;
        } else if (word.charAt(0) == puzzle[row][col]) {
            //System.out.println(word.charAt(0) + " was found at " + row + " " + col);

            CheckUp(puzzle, word.substring(1), row, col);
            printPuzzle[row][col] = word.charAt(0);

        } else {
            return;
        }
    }

    public static void CheckDown(char puzzle[][], String word, int row, int col) {
        row++;
        if (row >= 50) {
            return;
        } else if (word.length() == 1) {
            if (word.charAt(0) == puzzle[row][col]) {
                //System.out.println(word.charAt(0) + " was found at " + row + " " + col);
                printPuzzle[row][col] = word.charAt(0);

                System.out.println("You've found the word");
                found = true;
                return;
            }
            return;
        } else if (word.charAt(0) == puzzle[row][col]) {
            //System.out.println(word.charAt(0) + " was found at " + row + " " + col);

            CheckDown(puzzle, word.substring(1), row, col);
            printPuzzle[row][col] = word.charAt(0);

        } else {
            return;
        }
    }

    public static void CheckDiUpLeft(char puzzle[][], String word, int row, int col) {
        row--;
        col--;
        if (row <= 1 || col <= 1) {
            return;
        } else if (word.length() == 1) {
            if (word.charAt(0) == puzzle[row][col]) {
                //System.out.println(word.charAt(0) + " was found at " + row + " " + col);
                printPuzzle[row][col] = word.charAt(0);

                System.out.println("You've found the word");
                found = true;
                return;
            }
            return;
        } else if (word.charAt(0) == puzzle[row][col]) {
            //System.out.println(word.charAt(0) + " was found at " + row + " " + col);

            CheckDiUpLeft(puzzle, word.substring(1), row, col);
            printPuzzle[row][col] = word.charAt(0);

        } else {
            return;
        }
    }

    public static void CheckDiDownLeft(char puzzle[][], String word, int row, int col) {
        row++;
        col--;
        if (row >= 50 || col <= 1) {
            return;
        } else if (word.length() == 1) {
            if (word.charAt(0) == puzzle[row][col]) {
                //System.out.println(word.charAt(0) + " was found at " + row + " " + col);
                printPuzzle[row][col] = word.charAt(0);

                System.out.println("You've found the word");
                found = true;
                return;
            }
            return;
        } else if (word.charAt(0) == puzzle[row][col]) {
            //System.out.println(word.charAt(0) + " was found at " + row + " " + col);

            CheckDiDownLeft(puzzle, word.substring(1), row, col);
            printPuzzle[row][col] = word.charAt(0);

        } else {
            return;
        }
    }

    public static void CheckDiUpRight(char puzzle[][], String word, int row, int col) {
        row--;
        col++;
        if (row <= 1 || col >= 50) {
            return;
        } else if (word.length() == 1) {
            if (word.charAt(0) == puzzle[row][col]) {
                //System.out.println(word.charAt(0) + " was found at " + row + " " + col);
                printPuzzle[row][col] = word.charAt(0);

                System.out.println("You've found the word");
                found = true;
                return;
            }
            return;
        } else if (word.charAt(0) == puzzle[row][col]) {
            //System.out.println(word.charAt(0) + " was found at " + row + " " + col);

            CheckDiUpRight(puzzle, word.substring(1), row, col);
            printPuzzle[row][col] = word.charAt(0);

        } else {
            return;
        }
    }

    public static void CheckDiDownRight(char puzzle[][], String word, int row, int col) {
        row++;
        col++;
        if (row >= 50 || col >= 50) {
            return;
        } else if (word.length() == 1) {
            if (word.charAt(0) == puzzle[row][col]) {
                //System.out.println(word.charAt(0) + " was found at " + row + " " + col);
                printPuzzle[row][col] = word.charAt(0);

                System.out.println("You've found the word");
                found = true;
                return;
            }
            return;
        } else if (word.charAt(0) == puzzle[row][col]) {
            //System.out.println(word.charAt(0) + " was found at " + row + " " + col);

            CheckDiDownRight(puzzle, word.substring(1), row, col);
            printPuzzle[row][col] = word.charAt(0);

        } else {
            return;
        }
    }

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws IOException {
        //Variable Input files,array, etc
        Scanner puzzleInput = new Scanner(new File("/Users/carlosyoung/Documents/Towson/COSC600/Homework2/src/homework2/puzzleinput.txt"));
        Scanner puzzleWord = new Scanner(new File("/Users/carlosyoung/Documents/Towson/COSC600/Homework2/src/homework2/wordlist.txt"));

        String line;
        String line2;
        int pos = 1;
        char[][] puzzle = new char[51][51];
        //reads in puzzle
        while (puzzleInput.hasNext()) {
            line = puzzleInput.nextLine();
            for (int i = 1; i < 51; i++) {
                puzzle[pos][i] = line.charAt(i - 1);
            }
            pos++;
        }

        //reads in one word for the word list
        while (puzzleWord.hasNext()) {
            line2 = puzzleWord.nextLine();
            line2 = line2.toUpperCase();
            System.out.println(line2);
            //searchs for that word in the puzzle
            searchForWord(line2, puzzle);
            found = false;
        }
        
      System.out.println("");
        for (int i = 1; i < 51; i++) {
            for (int j = 1; j < 51; j++) {
                System.out.print(printPuzzle[i][j]);
            }
            System.out.print("\n");
        }
    }

}
