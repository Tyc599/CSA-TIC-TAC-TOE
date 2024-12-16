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
                System.out.println("HEEEEEEEEEEEEEEyyy Tompkins i know your tryna test my code for bugs but"
                +" guess what the're isn't any. now pick another spot. P.S you might wanna put on some glasses");
            }
        }
    }
}

