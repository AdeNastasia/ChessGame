import java.util.Arrays;

public class Field {
    private static final int SIDE = 8;
    private static ChessPiece[][] chessboard = new ChessPiece[SIDE][SIDE];

    public static void initializeGameField() {
        createChessboardWithoutPieces();
        createChessboardWithPieces();
        printChessBoard();
    }
    private static void createChessboardWithoutPieces() {
        ChessPiece ceil = ChessPiece.EMPTY_CEIL_W;
        for (int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard[i].length; j++) {
                chessboard[i][j] = ceil;
                if (j != chessboard[i].length - 1) {
                    ceil = ceil == ChessPiece.EMPTY_CEIL_W ? ChessPiece.EMPTY_CEIL_B : ChessPiece.EMPTY_CEIL_W;

                }
            }
        }
    }

    public static void createChessboardWithPieces() {
        for (int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard[i].length; j++) {
                ChessPiece[][] temp;
                if (i == 0 || i == 1) {
                    temp = ChessPiece.getPartOfBoardWithBlackPieces();
                    chessboard[i][j] = temp[i][j];
                }

                else if (i == 6 || i == 7) {
                    temp = ChessPiece.getPartOfBoardWithWhitePieces();
                    chessboard[i][j] = temp[SIDE - i - 1][SIDE - j - 1];
                }

            }
        }
    }

    public static void printChessBoard() {
        for (ChessPiece[] chessPieces : chessboard) {
            for (ChessPiece chessPiece : chessPieces) {
                System.out.print(chessPiece.getImage());
            }
            System.out.println();
        }
    }
}
