public abstract class ChessPiece {
    private ChessPieceKit typeOfPiece;
    private String color; // or create it like enum?
    private String image;
    private int value;
    private int x;

    public int getX() {
        return x;
    }

/*    public void setX(int x) {
        this.x = x;
    }*/

    public int getY() {
        return y;
    }

/*    public void setY(int y) {
        this.y = y;
    }*/

    private int y;


    public String getImage() {
        return image;
    }

    public abstract boolean canMove();
    public abstract void move();

    public ChessPiece(ChessPieceKit typeOfPiece, int x, int y) {
        this.typeOfPiece = typeOfPiece;
        this.color = typeOfPiece.isWhite() ? "WHITE" : "BLACK";
        this.image = typeOfPiece.getImage();
        this.value = typeOfPiece.getValue();
        this.x = x;
        this.y = y;
    }

}
