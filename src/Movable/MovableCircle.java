public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }
    public String toString() {
        return "MovableCircle{radius=" + this.radius + ", center=" + this.center + "}";
    }
    public void moveUp() {
        ++this.center.y;
    }
    public void moveDown() {
        --this.center.y;
    }
    public void moveRight() {
        ++this.center.x;
    }
    public void moveLeft() {
        --this.center.x;
    }
}
