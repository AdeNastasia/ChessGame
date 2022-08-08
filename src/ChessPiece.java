public enum ChessPiece {
    KING_W("♔", true),
    QUEEN_W("♕", true),
    BISHOP_W("♗", true),
    KNIGHT_W("♘", true),
    ROOK_W("♖", true),
    PAWN_W("♙", true),
    EMPTY_CEIL_W("▭"),

    KING_B("♚", false),
    QUEEN_B("♛", false),
    BISHOP_B("♝", false),
    KNIGHT_B("♞", false),
    ROOK_B("♜", false),
    PAWN_B("♟", false),

    EMPTY_CEIL_B("▬");

    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public void setWhite(boolean white) {
        isWhite = white;
    }

    public static ChessPiece[][] getPartOfBoardWithWhitePieces() {
        return partOfBoardWithWhitePieces;
    }

    public static void setPartOfBoardWithWhitePieces(ChessPiece[][] partOfBoardWithWhitePieces) {
        ChessPiece.partOfBoardWithWhitePieces = partOfBoardWithWhitePieces;
    }

    public static ChessPiece[][] getPartOfBoardWithBlackPieces() {
        return partOfBoardWithBlackPieces;
    }

    public static void setPartOfBoardWithBlackPieces(ChessPiece[][] partOfBoardWithBlackPieces) {
        ChessPiece.partOfBoardWithBlackPieces = partOfBoardWithBlackPieces;
    }

    private boolean isWhite;
    private static ChessPiece[][] partOfBoardWithWhitePieces = {{ROOK_W, KNIGHT_W, BISHOP_W, QUEEN_W, KING_W, BISHOP_W, KNIGHT_W, ROOK_W}, {PAWN_W, PAWN_W, PAWN_W, PAWN_W, PAWN_W, PAWN_W, PAWN_W, PAWN_W}};
    private static ChessPiece[][] partOfBoardWithBlackPieces = {{ROOK_B, KNIGHT_B, BISHOP_B, QUEEN_B, KING_B, BISHOP_B, KNIGHT_B, ROOK_B}, {PAWN_B, PAWN_B, PAWN_B, PAWN_B, PAWN_B, PAWN_B, PAWN_B, PAWN_B}};


    ChessPiece(String image) {
        this.image = image;
    }

    ChessPiece(String image, boolean isWhite) {
        this.image = image;
        this.isWhite = isWhite;
    }

}
