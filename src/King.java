public class King extends ChessPiece {
    public King(ChessPieceKit typeOfPiece, int x, int y) {
        super(typeOfPiece, x, y);
    }

    @Override
    public boolean canMove() {
        return false;
    }

    @Override
    public void move() {

    }
}
