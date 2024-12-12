private static void playerMove() {
    try (Scanner scanner = new Scanner(System.in)) {
        int row, col;
        while (true) {
            System.out.println("Player " + currentPlayer + ", enter your move (row and column):");
            row = scanner.nextInt();
            col = scanner.nextInt();
            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-') {
                board[row][col] = currentPlayer;
                break;
            } else {
                System.out.println("This move is not valid");
            }
        }
    }
}

private static void switchPlayer() {
    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
}

private static boolean isBoardFull() {
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (board[i][j] == '-') {
                return false;
            }
        }
    }
    return true;
}
