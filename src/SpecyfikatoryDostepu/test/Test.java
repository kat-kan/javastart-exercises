package SpecyfikatoryDostepu.test;

import SpecyfikatoryDostepu.data.Point;
import SpecyfikatoryDostepu.controller.PointController;

public class Test {

    public static void main(String[] args) {
        Point point = new Point(1,1);
        PointController controller = new PointController();
/*        controller.addX(point);
        System.out.println(point.getX());
        controller.addY(point);
        System.out.println(point.getY());
        controller.minusX(point);
        System.out.println(point.getX());
        controller.minusY(point);
        System.out.println(point.getY());*/
        final int add1_x = 0;
        final int add1_y = 1;
        final int minus1_x = 2;
        final int minus1_y = 3;
        int number = 2;
        switch(number){
            case add1_x:
                System.out.println(point.getX());
                controller.addX(point);
                System.out.println(point.getX());
                break;
            case add1_y:
                System.out.println(point.getY());
                controller.addY(point);
                System.out.println(point.getY());
                break;
            case minus1_x:
                System.out.println(point.getX());
                controller.minusX(point);
                System.out.println(point.getX());
                break;
            case minus1_y:
                System.out.println(point.getY());
                controller.minusY(point);
                System.out.println(point.getY());
                break;
            default:
                System.out.println("Wybrano nieistniejącą opcję");
        }


    }
}
