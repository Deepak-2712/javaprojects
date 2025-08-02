import java.util.Scanner;

public class ConnectFour {


    static final int ROWS = 6;
    static final int COLS = 7;
    static final char EMPTY = ' ';
    static final char PLAYER1 = 'X';
    static final char PLAYER2 = 'O';

    public static void main(String[] args) {
        char[][] board = new char[ROWS][COLS];
        initializeBoard(board);
        boolean player1Turn = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Connect 4!");

        while (true) {
            printBoard(board);

            char currentPlayer = player1Turn ? PLAYER1 : PLAYER2;
            System.out.print("Player " + currentPlayer + ", enter your move (1-7): ");
            int col;

            if (scanner.hasNextInt()) {
                col = scanner.nextInt() - 1;
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and 7.");
                scanner.next(); // Clear invalid input
                continue;
            }

            if (isValidMove(board, col)) {
                makeMove(board, col, currentPlayer);
                if (isBoardFull(board)) {
                    printBoard(board);
                    System.out.println("It's a tie!");
                    break;
                }
                player1Turn = !player1Turn;
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }

        scanner.close();
    }


    static void initializeBoard(char[][] board) {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                board[i][j] = EMPTY;
            }
        }
    }


    static void printBoard(char[][] board) {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                System.out.print("| " + board[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("-----------------------------");
        System.out.println("| 1 | 2 | 3 | 4 | 5 | 6 | 7 |");
        System.out.println("-----------------------------");
    }

    // Check if a move is valid
    static boolean isValidMove(char[][] board, int col) {
        return col >= 0 && col < COLS && board[0][col] == EMPTY;
    }

    // Make a move
    static void makeMove(char[][] board, int col, char player) {
        for (int i = ROWS - 1; i >= 0; i--) {
            if (board[i][col] == EMPTY) {
                board[i][col] = player;
                break;
            }
        }
    }


    static boolean isBoardFull(char[][] board) {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (board[i][j] == EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
}
