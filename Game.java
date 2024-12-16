public class Game {
    private Board board;
    private Player currentPlayer;

    public Game() {
        board = new Board();
        currentPlayer = new Player('X');
    }

    public void play() {
        board.printBoard();
        while (true) {
            currentPlayer.makeMove(board);
            board.printBoard();
            if (board.isWinner(currentPlayer.getSymbol())) {
                System.out.println("Player " + currentPlayer.getSymbol() + " wins!");
                break;
            }
            if (board.isBoardFull()) {
                System.out.println("The game is a tie!");
                break;
            }
            switchPlayer();
        }
    }

    private void switchPlayer() {
        currentPlayer = (currentPlayer.getSymbol() == 'X') ? new Player('O') : new Player('X');
    }
}
