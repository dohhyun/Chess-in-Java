package base;

import helpers.Position;

public class Move {
    private final Position start;
    private final Position end;

    private Player owner;

    /**
     * Constructers to interpret move
     * @param start starting position of the piece
     * @param end ending position of the piece
     * @param owner owner of the piece
     */
    public Move (Position start, Position end, Player owner) {
        this.start = start;
        this.end = end;
        this.owner = owner;
    }

    public Position getStart() {
        return start;
    }

    public Position getEnd() {
        return end;
    }

    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }
}
