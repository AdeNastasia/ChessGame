public class EmptyCeil extends ChessPiece {
    public EmptyCeil(ChessPieceKit typeOfPiece, int x, int y) {
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
