public class EmptyCeil extends ChessPiece {
    public EmptyCeil(ChessPieceKit typeOfPiece) {
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
