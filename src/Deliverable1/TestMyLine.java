package Deliverable1;

import java.util.Arrays;

public class TestMyLine {
    public static void main(String[] args) {
        MyLine l1 = new MyLine(4, 6, 8, 10); //Parametrized Constructor Test
        MyLine l2 = new MyLine(new MyPoint(3, 6), new MyPoint(9, 12)); //Object Constructor Test

        System.out.println("\n\n" + l1); //toString() Test

        System.out.println("\n\n///Getter Method Tests///\n");

        System.out.printf("getBegin() Test: %s\n", l1.getBegin());

        System.out.printf("getBeginX() Test: %d\n", l1.getBeginX());

        System.out.printf("getBeginY() Test: %d\n", l1.getBeginY());

        System.out.printf("getBeginXY() Test: %s\n", Arrays.toString(l1.getBeginXY()));

        System.out.printf("getEnd(): %s\n", l1.getEnd());

        System.out.printf("getEndX(): %d\n", l1.getEndX());

        System.out.printf("getEndY(): %d\n", l1.getEndY());

        System.out.printf("getEndXY(): %s\n", Arrays.toString(l1.getEndXY()));

        System.out.printf("getLength(): %.2f\n", l1.getLength());

        System.out.printf("getGradient(): %.2f\n", l1.getGradient());

        System.out.println("\n\n///Setter Method Tests///\n");

        System.out.printf("Before setBegin(): %s\n", l1);
        l1.setBegin(new MyPoint(5, 7));
        System.out.printf("After setBegin(): %s\n\n", l1);

        System.out.printf("Before setBeginX(): %s\n", l1);
        l1.setBeginX(4);
        System.out.printf("After setBeginX(): %s\n\n", l1);

        System.out.printf("Before setBeginY(): %s\n", l1);
        l1.setBeginY(2);
        System.out.printf("After setBeginY(): %s\n\n", l1);

        System.out.printf("Before setBeginXY(): %s\n", l1);
        l1.setBeginXY(9, 10);
        System.out.printf("After setBeginXY(): %s\n\n", l1);

        System.out.printf("Before setEnd(): %s\n", l1);
        l1.setEnd(new MyPoint(5, 7));
        System.out.printf("After setEnd(): %s\n\n", l1);

        System.out.printf("Before setEndX(): %s\n", l1);
        l1.setEndX(4);
        System.out.printf("After setEndX(): %s\n\n", l1);

        System.out.printf("Before setEndY(): %s\n", l1);
        l1.setEndY(2);
        System.out.printf("After setEndY(): %s\n\n", l1);

        System.out.printf("Before setEndXY(): %s\n", l1);
        l1.setEndXY(9, 10);
        System.out.printf("After setEndXY(): %s\n\n", l1);
    }
}