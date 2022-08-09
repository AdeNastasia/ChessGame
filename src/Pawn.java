public class Pawn extends ChessPiece {
    public Pawn(ChessPieceKit typeOfPiece) {
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
