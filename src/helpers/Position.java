package helpers;
/*
    Helper class for positioning
 */
public class Position {
    private int x;
    private int y;

    public Position (Position p) {
        this.x = p.getX();
        this.y = p.getY();
    }

    public Position () {
        x=0;
        y=0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
