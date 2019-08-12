public class chessBoard

    int[][] chessGrid = { {0, 1, 2, 3, 4, 5, 6, 7}, {0, 1, 2, 3, 4, 5, 6, 7} };

    int startRookB = chessGrid[0][0];
    int startKnightB = chessGrid[0][1];
    int startBishopB = chessGrid[0][2];
    int startKingB = chessGrid[0][3];
    int startQueenB = chessGrid[0][4];
    int startBishopB2 = chessGrid[0][5];
    int startKnightB2 = chessGrid[0][6];
    int startRookB2 = chessGrid[0][7];
    int startRookW = chessGrid[7][0];
    int startKnightW = chessGrid[7][1];
    int startBishopW = chessGrid[7][2];
    int startKingW = chessGrid[7][3];
    int startQueenW = chessGrid[7][4];
    int startBishopW2 = chessGrid[7][5];
    int startKnightW2 = chessGrid[7][6];
    int startRookW2 = chessGrid[7][7];

    for (int p : chessGrid) {
        System.out.println(p); /// Print position on chess board.
    }
}
