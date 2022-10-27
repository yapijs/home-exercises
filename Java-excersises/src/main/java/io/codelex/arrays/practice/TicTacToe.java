package io.codelex.arrays.practice;

import java.util.Scanner;

public class TicTacToe {

    private static final char[][] board = new char[3][3];
    private static char nextTurn = 'O';
    private static char winner = ' ';

    public static void main(String[] args) {

        initBoard();

        while (!isGameEnded()) {
            displayBoard();
            enterValues();
        }
        displayBoard();
        displayWinner();
    }

    public static void enterValues() {
        Scanner keyboard = new Scanner(System.in);
        int valueR = -1;
        int valueC = -1;
        while (valueR < 0 || valueR > 2 || valueC < 0 || valueC > 2){
            System.out.print("'" + nextTurn + "', choose your location (row, column): ");
            String input = keyboard.nextLine();
            input = input.replaceAll("[^- \\d]", "").trim();
            valueR = Integer.parseInt(input.substring(0, input.indexOf(' ')));
            valueC = Integer.parseInt(input.substring(input.indexOf(' ') + 1));
            if (valueR >= 0 && valueR <= 2 && valueC >= 0 && valueC <= 2) {
                if (board[valueR][valueC] != ' ') {
                    System.out.println("Field " + valueR + " " + valueC + " is taken. Choose another (row, column)");
                    valueR = -1;
                    valueC = -1;
                }
            } else {
                System.out.println("Please enter valid values (0..2):");
            }
        }
        board[valueR][valueC] = getAndSetTurnOX();
    }

    private static boolean isGameEnded() {
        return checkRowWinner() || checkColumnWinner() || checkDiagonalWinner() || checkForTie();
    }
    public static void initBoard() {
        // fills up the board with blanks
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                board[r][c] = ' ';
    }

    private static char getAndSetTurnOX() {
        char currentTurn = ' ';
        if (nextTurn == 'O') {
            currentTurn = nextTurn;
            nextTurn = 'X';
        } else {
            currentTurn = nextTurn;
            nextTurn = 'O';
        }
        return currentTurn;
    }


    private static boolean checkRowWinner() {
        boolean gameEnded = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != ' ') {
                gameEnded = true;
                winner = board[i][0];
                break;
            }
        }
        return gameEnded;
    }

    private static boolean checkColumnWinner() {
        boolean gameEnded = false;
            for (int i = 0; i < board.length; i++) {
                if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != ' ') {
                    gameEnded = true;
                    winner = board[0][i];
                    break;
                }
            }
        return gameEnded;
    }

    private static boolean checkDiagonalWinner() {
        boolean gameEnded = false;
        if ((board[0][0] == board[1][1] && board[2][2] == board[1][1] ||
                board[2][0] == board[1][1] && board[0][2] == board[1][1]) && board[1][1]  != ' ') {
            gameEnded = true;
            winner = board[1][1];
        }
        return gameEnded;
    }

    private static boolean checkForTie() {
        boolean allFieldsFull = true;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == ' ') {
                    allFieldsFull = false;
                    break;
                }
            }
            if (!allFieldsFull) {
                break;
            }
        }
        return allFieldsFull;
    }

    public static void displayBoard() {
        System.out.println("     0 1 2 ");
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
    }

    private static void displayWinner() {
        if (winner == ' ') {
            System.out.println("The game is a tie.");
        } else {
            System.out.println("The winner is '" + winner + "'.");
        }


    }
}