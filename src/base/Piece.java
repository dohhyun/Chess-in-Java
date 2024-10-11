package base;

import helpers.PieceDict;
import helpers.Position;

public class Piece {
    private Position position;
    private final Player owner;
    private PieceDict name;

    public Piece(Position position, Player owner, PieceDict name) {
        this.position = position;
        this.owner = owner;
        this.name = name;
    }
}
