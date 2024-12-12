private static void initializeBoard() {
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            board[i][j] = '-';
        }
    }
}

private static void printBoard() {
    System.out.println("  0 1 2");
    for (int i = 0; i < 3; i++) {
        System.out.print(i + " ");
        for (int j = 0; j < 3; j++) {
            System.out.print(board[i][j] + " ");
        }
        System.out.println();
    }
}