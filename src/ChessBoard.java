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
                ChessPiece newPiece = new EmptyCeil(ceil);
                chessboard[i][j] = newPiece;
                // присваиваем фигуре координаты соответствующей ячейки:
                newPiece.setX(j);
                newPiece.setY(i);
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
                ChessPiece newPiece = null; // переменная для хранения будущей фигуры
                if (i == 0 || i == 1) {
                    temp = ChessPieceKit.getPartOfBoardWithBlackPieces();
                    item = temp[i][j];

                    switch (item) {
                        case KING_B -> newPiece = new King(item);
                        case QUEEN_B -> newPiece = new Queen(item);
                        case BISHOP_B -> newPiece = new Bishop(item);
                        case KNIGHT_B -> newPiece = new Knight(item);
                        case ROOK_B -> newPiece = new Rook(item);
                        case PAWN_B -> newPiece = new Pawn(item);
                    }

                } else if (i == 6 || i == 7) {
                    temp = ChessPieceKit.getPartOfBoardWithWhitePieces();
                    item = temp[SIDE - i - 1][SIDE - j - 1];
                    switch (item) {
                        case KING_W -> newPiece = new King(item);
                        case QUEEN_W -> newPiece = new Queen(item);
                        case BISHOP_W -> newPiece = new Bishop(item);
                        case KNIGHT_W -> newPiece = new Knight(item);
                        case ROOK_W -> newPiece = new Rook(item);
                        case PAWN_W -> newPiece = new Pawn(item);
                    }
                }

                chessboard[i][j] = newPiece;
                // задаем значения x и y для фигуры:
                try {
                    newPiece.setX(j);
                    newPiece.setY(i);
                } catch (NullPointerException e) {
                    System.out.println("При заполнении шахматной фигуры самими фигурами возникла ошибка. На поле располагается null элемент.");
                    e.printStackTrace();
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
