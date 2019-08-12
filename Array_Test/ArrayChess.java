public class ArrayChess {
    
    public static void main(String[] args) {

        int[][] chessGrid = { {0, 1, 2, 3, 4, 5, 6, 7}, {0, 1, 2, 3, 4, 5, 6, 7} };

        int startRookB = chessGrid[0][0];
        int startKnightB = chessGrid[0][1];
        int startBishopB = chessGrid[0][2];
        int startKingB = chessGrid[0][3];
        int startQueenB = chessGrid[0][4];
        int startBishopB2 = chessGrid[0][5];
        int startKnightB2 = chessGrid[0][6];
        int startRookB2 = chessGrid[0][7];
        int startRookW = chessGrid[1][0];
        int startKnightW = chessGrid[1][1];
        int startBishopW = chessGrid[1][2];
        int startKingW = chessGrid[1][3];
        int startQueenW = chessGrid[1][4];
        int startBishopW2 = chessGrid[1][5];
        int startKnightW2 = chessGrid[1][6];
        int startRookW2 = chessGrid[1][7];

        for (int[] p : chessGrid) {
            for (int q:p) {
                System.out.println(q); /// Print position on chess board.
            }
        }
    }
}
