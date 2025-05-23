package Deliverable2;
import Deliverable1.MyPoint;
import java.util.Arrays;

public class TestMyRectangle {
    public static void main(String[] args) {
        MyRectangle r1 = new MyRectangle(new MyPoint(3, 6), new MyPoint(9, 12)); //Object Constructor Test
        MyRectangle r2 = new MyRectangle(2, 4, 6, 8); //Parametrized Constructor Test


        System.out.println("\n\n" + r1); //toString() Test

        System.out.println("\n\n///Getter Method Tests///\n");

        System.out.printf("getTopLeft() Test: %s\n", r1.getTopLeft());

        System.out.printf("getTopLeftX() Test: %d\n", r1.getTopLeftX());

        System.out.printf("getTopLeftY() Test: %d\n", r1.getTopLeftY());

        System.out.printf("getTopLeftXY() Test: %s\n", Arrays.toString(r1.getTopLeftXY()));

        System.out.printf("getBottomRight(): %s\n", r1.getBottomRight());

        System.out.printf("getBottomRightX(): %d\n", r1.getBottomRightX());

        System.out.printf("getBottomRightY(): %d\n", r1.getBottomRightY());

        System.out.printf("getBottomRightXY(): %s\n", Arrays.toString(r1.getBottomRightXY()));

        System.out.printf("getPerimeter(): %.2f\n", r1.getPerimeter());

        System.out.printf("getArea(): %.2f\n", r1.getArea());

        System.out.println("\n\n///Setter Method Tests///\n");

        System.out.printf("Before setTopLeft(): %s\n", r1);
        r1.setTopLeft(new MyPoint(5, 7));
        System.out.printf("After setTopLeft(): %s\n\n", r1);

        System.out.printf("Before setTopLeftX(): %s\n", r1);
        r1.setTopLeftX(4);
        System.out.printf("After setTopLeftX(): %s\n\n", r1);

        System.out.printf("Before setTopLeftY(): %s\n", r1);
        r1.setTopLeftY(2);
        System.out.printf("After setTopLeftY(): %s\n\n", r1);

        System.out.printf("Before setTopLeftXY(): %s\n", r1);
        r1.setTopLeftXY(9, 10);
        System.out.printf("After setTopLeftXY(): %s\n\n", r1);

        System.out.printf("Before setBottomRight(): %s\n", r1);
        r1.setBottomRight(new MyPoint(5, 7));
        System.out.printf("After setBottomRight(): %s\n\n", r1);

        System.out.printf("Before setBottomRightX(): %s\n", r1);
        r1.setBottomRightX(4);
        System.out.printf("After setBottomRightX(): %s\n\n", r1);

        System.out.printf("Before setBottomRightY(): %s\n", r1);
        r1.setBottomRightY(2);
        System.out.printf("After setBottomRightY(): %s\n\n", r1);

        System.out.printf("Before setBottomRightXY(): %s\n", r1);
        r1.setBottomRightXY(9, 10);
        System.out.printf("After setBottomRightXY(): %s\n\n", r1);
    }
}
