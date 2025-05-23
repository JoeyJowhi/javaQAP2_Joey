package Deliverable2;

import Deliverable1.MyPoint;

public class MyRectangle {
    private MyPoint topLeft, bottomRight;

    //Constructors
    public MyRectangle(MyPoint tl, MyPoint br) {
        this.topLeft = tl;
        this.bottomRight = br;
    }

    public MyRectangle(int tlX, int tlY, int brX, int brY) {
        this.topLeft = new MyPoint(tlX, tlY);
        this.bottomRight = new MyPoint(brX, brY);
    }


    //Instance Methods
    public String toString() {
        return String.format("MyRectangle[topLeft = %s, bottomRight = %s]", this.topLeft, this.bottomRight);
    }


    //Getter Methods
    public MyPoint getTopLeft() {
        return this.topLeft;
    }

    public int getTopLeftX() {
        return this.topLeft.getX();
    }

    public int getTopLeftY() {
        return this.topLeft.getY();
    }

    public int[] getTopLeftXY() {
        return new int[] {this.getTopLeftX(), this.getTopLeftY()};
    }

    public MyPoint getBottomRight() {
        return this.bottomRight;
    }

    public int getBottomRightX() {
        return this.bottomRight.getX();
    }

    public int getBottomRightY() {
        return this.bottomRight.getY();
    }

    public int[] getBottomRightXY() {
        return new int[] {this.getBottomRightX(), this.getBottomRightY()};
    }

    public double getPerimeter() {
        return (this.getTopLeftX() + this.getTopLeftY() + this.getBottomRightX() + this.getBottomRightY());
    }

    public double getArea() {
        return (this.getTopLeftX() + this.getBottomRightX()) * (this.getTopLeftY() + this.getBottomRightY());
    }


    //Setter Methods
    public void setTopLeft(MyPoint tl) {
        this.topLeft = tl;
    }

    public void setTopLeftX(int x) {
        this.topLeft.setX(x);
    }

    public void setTopLeftY(int y) {
        this.topLeft.setY(y);
    }

    public void setTopLeftXY(int x, int y) {
        this.topLeft.setXY(x, y);
    }

    public void setBottomRight(MyPoint br) {
        this.bottomRight = br;
    }

    public void setBottomRightX(int x) {
        this.bottomRight.setX(x);
    }

    public void setBottomRightY(int y) {
        this.bottomRight.setY(y);
    }

    public void setBottomRightXY(int x, int y) {
        this.bottomRight.setXY(x, y);
    }
}
