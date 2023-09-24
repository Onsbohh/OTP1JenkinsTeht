package org.example;

import java.awt.*;
import java.awt.geom.Point2D;

public class PointDistance {
    double x1;
    double x2;
    double y1;
    double y2;

    Point2D.Double point1;
    Point2D.Double point2;
    double distance;
    public PointDistance(double x1, double x2, double y1, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public void createPoints() {
        point1 = new Point2D.Double(x1, y1);
        point2 = new Point2D.Double(x2, y2);
    }

    public void calculate() {
        distance = point1.distance(point2);
    }


    public double getDistance() {
        return distance;
    }

    public Point2D.Double getPoint1() {
        return point1;
    }

    public Point2D.Double getPoint2() {
        return point2;
    }
}
