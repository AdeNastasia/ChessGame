public class King extends ChessPiece {
    public King(ChessPieceKit typeOfPiece) {
        super(typeOfPiece);
    }

    @Override
    public boolean canMove() {
        return false;
    }

    @Override
    public void move() {

    }
}
