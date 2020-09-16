public class MoviblePointRectangle implements Movable {
    int x1;
    int y1;
    int x2;
    int y2;
    int xSpeed;
    int ySpeed;
    public MoviblePointRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public void setX1(int x1) {
        this.x1 = x1;
    }
    public void setY1(int y1) {
        this.y1 = y1;
    }
    public void setX2(int x2) {
        this.x2 = x2;
    }
    public void setY2(int y2) {
        this.y2 = y2;
    }
    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }
    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }
    public String toString() {
        return "MoviblePointRectangle{x1=" + this.x1 + ", y1=" + this.y1 + ", x2=" + this.x2 + ", y2=" + this.y2 + ", xSpeed=" + this.xSpeed + ", ySpeed=" + this.ySpeed + "}";
    }
    public void moveUp() {
        if (this.Proverka()) {
            ++this.y1;
            ++this.y2;
        }

    }
    public void moveDown() {
        if (this.Proverka()) {
            --this.y1;
            --this.y2;
        }

    }
    public void moveRight() {
        if (this.Proverka()) {
            ++this.x1;
            ++this.x2;
        }

    }
    public void moveLeft() {
        if (this.Proverka()) {
            --this.x1;
            --this.x2;
        }

    }
    public boolean Proverka() {
        return this.xSpeed == this.ySpeed;
    }
}