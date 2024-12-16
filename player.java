import java.util.Scanner;

public class Player {
    private char symbol;

    public Player(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    public void makeMove(Board board) {
        Scanner scanner = new Scanner(System.in);
        int row, col;
        while (true) {
            System.out.println("Player " + symbol + ", enter your move (row and column): ");
            row = scanner.nextInt();
            col = scanner.nextInt();
            if (board.isValidMove(row, col)) {
                board.placeMove(row, col, symbol);
                break;
            } else {
                System.out.println("This move is not valid");
            }
        }
    }
}

