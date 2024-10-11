package base;

public class GameState {
    public Piece[][] placements;
    private final Player turn;

    public GameState() {
        placements = new Piece[7][7];
        turn = Player.WHITE;
    }

    public GameState(Piece[][] placements, Player turn) {
        this.placements = placements;
        this.turn = turn;
    }

    
}
