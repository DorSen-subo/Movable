public class MovableRectangle implements Movable {
    private MoviblePointRectangle topLeft;
    private MoviblePointRectangle bottomRight;
    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MoviblePointRectangle(x1, y1, x2, y2, xSpeed, ySpeed);
        this.bottomRight = new MoviblePointRectangle(x1, y1, x2, y2, xSpeed, ySpeed);
    }
    public String toString() {
        return "MovableRectangle{topLeft=" + this.topLeft + ", bottomRight=" + this.bottomRight + "}";
    }
    public void moveUp() {
        if (this.Proverka()) {
            ++this.topLeft.y1;
            ++this.topLeft.y2;
        }

    }
    public void moveDown() {
        if (this.Proverka()) {
            --this.topLeft.y1;
            --this.topLeft.y2;
        }

    }
    public void moveRight() {
        if (this.Proverka()) {
            ++this.topLeft.x1;
            ++this.topLeft.x2;
        }

    }
    public void moveLeft() {
        if (this.Proverka()) {
            --this.topLeft.x1;
            --this.topLeft.x2;
        }
    }
    public boolean Proverka() {
        return this.topLeft.xSpeed == this.bottomRight.xSpeed && this.topLeft.ySpeed == this.bottomRight.ySpeed;
    }
}