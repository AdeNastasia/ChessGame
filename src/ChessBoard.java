public class ChessBoard {
    private static final int SIDE = 8;
    int column;
    int row;
    private static ChessPiece[][] chessboard = new ChessPiece[SIDE][SIDE];

    public static void initializeGameField() {
        createChessboardWithoutPieces();
        createChessboardWithPieces();
        printChessBoard();
    }
    private static void createChessboardWithoutPieces() {
        ChessPieceKit ceil = ChessPieceKit.EMPTY_CEIL_W;
        for (int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard[i].length; j++) {
                chessboard[i][j] = new EmptyCeil(ceil);
                if (j != chessboard[i].length - 1) {
                    ceil = ceil == ChessPieceKit.EMPTY_CEIL_W ? ChessPieceKit.EMPTY_CEIL_B : ChessPieceKit.EMPTY_CEIL_W;

                }
            }
        }
    }

    public static void createChessboardWithPieces() {
        for (int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard[i].length; j++) {
                ChessPieceKit[][] temp;
                ChessPieceKit item;
                if (i == 0 || i == 1) {
                    temp = ChessPieceKit.getPartOfBoardWithBlackPieces();
                    item = temp[i][j];
                    switch (item) {
                        case KING_B -> chessboard[i][j] = new King(item);
                        case QUEEN_B -> chessboard[i][j] = new Queen(item);
                        case BISHOP_B -> chessboard[i][j] = new Bishop(item);
                        case KNIGHT_B -> chessboard[i][j] = new Knight(item);
                        case ROOK_B -> chessboard[i][j] = new Rook(item);
                        case PAWN_B -> chessboard[i][j] = new Pawn(item);
                    }

                }

                else if (i == 6 || i == 7) {
                    temp = ChessPieceKit.getPartOfBoardWithWhitePieces();
                    item = temp[SIDE - i - 1][SIDE - j - 1];
                    switch (item) {
                        case KING_W -> chessboard[i][j] = new King(item);
                        case QUEEN_W -> chessboard[i][j] = new Queen(item);
                        case BISHOP_W -> chessboard[i][j] = new Bishop(item);
                        case KNIGHT_W -> chessboard[i][j] = new Knight(item);
                        case ROOK_W -> chessboard[i][j] = new Rook(item);
                        case PAWN_W -> chessboard[i][j] = new Pawn(item);
                    }
                }

            }
        }
    }

    public static void printChessBoard() {

        for (int i = 0; i < chessboard.length; i++) {
            System.out.print(i + 1 + "| ");
            for (int j = 0; j < chessboard[i].length; j++) {
                System.out.print(chessboard[i][j].getImage() + " ");
            }
            System.out.println();
            if (i == chessboard.length - 1) {
                for (int j = 0; j < chessboard[i].length; j++) {
                    if (j == 0) {
                        System.out.print("  —");
                    } else {
                        System.out.print("———");
                    }
                }
            }
        }
        System.out.println();
        System.out.print("  |A||B||C|D||E|F||G||H|");

    }
}
