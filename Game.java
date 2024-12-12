public class TicTacToe {
    private static char[][] board;
    private static char currentPlayer;

    public static void main(String[] args) {
        board = new char[3][3];
        currentPlayer = 'X';
        initializeBoard();
        printBoard();

        while (true) {
            playerMove();
            printBoard();
            if (isWinner()) {
                System.out.println("Player " + currentPlayer + " wins!");
                break;
            }
            if (isBoardFull()) {
                System.out.println("The game is a tie!");
                break;
            }
            switchPlayer();
        }