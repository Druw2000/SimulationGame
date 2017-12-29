
public class Player {
    private int x;
    private int y;
    private int d;
    // 0 = up
    // 90 = right
    // 180 = down
    // 270 = left
    
    public Player(int x1, int y1, int d1) {
        x = x1;
        y = y1;
        d = d1;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getD() {
        return d;
    }
    public void move(int x1) {
        x += x1;
    }
    public void turn(int d1) {
        d += d1;
    }
}
