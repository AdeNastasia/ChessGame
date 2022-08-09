public class Queen extends ChessPiece {
    public Queen(ChessPieceKit typeOfPiece) {
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
