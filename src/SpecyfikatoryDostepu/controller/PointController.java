package SpecyfikatoryDostepu.controller;

import SpecyfikatoryDostepu.data.Point;

public class PointController {

    public void addX(Point point){
        int x = point.getX();
        point.setX(x+1);
    }

    public void minusX(Point point){
        int x = point.getX();
        point.setX(x-1);
    }

    public void addY(Point point){
        int y = point.getY();
        point.setY(y+1);
    }

    public void minusY(Point point) {
        int y = point.getY();
        point.setY(y-1);
    }
}
