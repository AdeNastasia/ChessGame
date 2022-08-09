public enum ChessPieceKit {
    KING_W("♔", true, 50), // maybe I should change values later ?
    QUEEN_W("♕", true, 30),
    BISHOP_W("♗", true, 20),
    KNIGHT_W("♘", true, 15),
    ROOK_W("♖", true, 10),
    PAWN_W("♙", true, 5),
    EMPTY_CEIL_W("▭"),

    KING_B("♚", false, 50),
    QUEEN_B("♛", false, 30),
    BISHOP_B("♝", false, 20),
    KNIGHT_B("♞", false, 15),
    ROOK_B("♜", false, 10),
    PAWN_B("♟", false, 5),

    EMPTY_CEIL_B("▬");

    private String image;
    private int value;
    private boolean isWhite;
    private static ChessPieceKit[][] partOfBoardWithWhitePieces = {{ROOK_W, KNIGHT_W, BISHOP_W, QUEEN_W, KING_W, BISHOP_W, KNIGHT_W, ROOK_W}, {PAWN_W, PAWN_W, PAWN_W, PAWN_W, PAWN_W, PAWN_W, PAWN_W, PAWN_W}};
    private static ChessPieceKit[][] partOfBoardWithBlackPieces = {{ROOK_B, KNIGHT_B, BISHOP_B, QUEEN_B, KING_B, BISHOP_B, KNIGHT_B, ROOK_B}, {PAWN_B, PAWN_B, PAWN_B, PAWN_B, PAWN_B, PAWN_B, PAWN_B, PAWN_B}};


    public String getImage() {
        return image;
    }


    public int getValue() {
        return value;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public static ChessPieceKit[][] getPartOfBoardWithWhitePieces() {
        return partOfBoardWithWhitePieces;
    }

    public static ChessPieceKit[][] getPartOfBoardWithBlackPieces() {
        return partOfBoardWithBlackPieces;
    }



    ChessPieceKit(String image) {
        this.image = image;
    }

    ChessPieceKit(String image, boolean isWhite, int value) {
        this.image = image;
        this.isWhite = isWhite;
        this.value = value;
    }

}
