public abstract class ChessPiece {
    private ChessPieceKit typeOfPiece;
    private String color; // or create it like enum?
    private String image;
    private int value;
    int column;
    int row;

    public String getImage() {
        return image;
    }

    public abstract boolean canMove();
    public abstract void move();

    public ChessPiece(ChessPieceKit typeOfPiece) {
        this.typeOfPiece = typeOfPiece;
        this.color = typeOfPiece.isWhite() ? "WHITE" : "BLACK";
        this.image = typeOfPiece.getImage();
        this.value = typeOfPiece.getValue();
    }

}
