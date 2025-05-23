package Deliverable1;

public class MyLine {
    private MyPoint begin, end;


    //Constructors
    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);
    }

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }


    //Instance Methods
    public String toString() {
        return String.format("MyLine[begin = %s, end = %s]", this.begin, this.end);
    }


    //Getter Methods
    public MyPoint getBegin() {
        return this.begin;
    }

    public int getBeginX() {
        return this.begin.getX();
    }

    public int getBeginY() {
        return this.begin.getY();
    }

    public int[] getBeginXY() {
        return new int[] {this.begin.getX(), this.begin.getY()};
    }

    public MyPoint getEnd() {
        return this.end;
    }

    public int getEndX() {
        return this.end.getX();
    }

    public int getEndY() {
        return this.end.getY();
    }

    public int[] getEndXY() {
        return new int[] {this.end.getX(), this.end.getY()};
    }

    public double getLength() {
        return this.begin.distance(this.end);
    }

    public double getGradient() {
        return Math.atan2(this.getBeginY() - this.getEndY(), this.getBeginX() - this.getEndX());
    }


    //Setter Methods
    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public void setBeginX(int x) {
        this.begin.setX(x);
    }

    public void setBeginY(int y) {
        this.begin.setY(y);
    }

    public void setBeginXY(int x, int y) {
        this.begin.setXY(x, y);
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    public void setEndX(int x) {
        this.end.setX(x);
    }

    public void setEndY(int y) {
        this.end.setY(y);
    }

    public void setEndXY(int x, int y) {
        this.end.setXY(x, y);
    }
}