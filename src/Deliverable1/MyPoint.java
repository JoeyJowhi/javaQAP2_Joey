package Deliverable1;

public class MyPoint {
    private int x;
    private int y;

    //Constructors
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }


    //Instance Methods
    public String toString() {
        return String.format("(%d, %d)", this.x, this.y);
    }

    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;

        return (Math.sqrt(xDiff * xDiff) + (yDiff * yDiff));
    }

    public double distance(MyPoint p) {
        int xDiff = this.x - p.x;
        int yDiff = this.y - p.y;

        return (Math.sqrt(xDiff * xDiff) + (yDiff * yDiff));
    }

    public double distance() {
        int xDiff = this.x;
        int yDiff = this.y;

        return (Math.sqrt(xDiff * xDiff) + (yDiff * yDiff));
    }


    //Getter Methods
    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    
    //Setter Methods
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
}