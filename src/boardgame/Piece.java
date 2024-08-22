package boardgame;

public class Piece {
    protected Position position;
    //"The attribute should be protected because only the BoardGame class and its inherited pieces should have access."
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position =null;

    }

    public Board getBoard() {
        return board;
    }
}
