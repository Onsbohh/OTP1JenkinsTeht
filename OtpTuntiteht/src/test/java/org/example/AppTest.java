package org.example;


import org.junit.Before;
import org.junit.Test;

import java.awt.geom.Point2D;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class AppTest {
    private PointDistance pointDistance;

    @Before
    public void setUp() {
        // Initialize the PointDistance object with sample coordinates
        pointDistance = new PointDistance(1.0, 4.0, 2.0, 6.0);
        // Create points and calculate distance before each test
        pointDistance.createPoints();
        pointDistance.calculate();
    }

    @Test
    public void testCreatePoints() {
        Point2D.Double point1 = pointDistance.getPoint1();
        Point2D.Double point2 = pointDistance.getPoint2();

        assertNotNull(point1);
        assertNotNull(point2);
        assertEquals(1.0, point1.getX(), 0.001);
        assertEquals(2.0, point1.getY(), 0.001);
        assertEquals(4.0, point2.getX(), 0.001);
        assertEquals(6.0, point2.getY(), 0.001);
    }

    @Test
    public void testCalculateDistance() {
        double expectedDistance = 5.0;
        double actualDistance = pointDistance.getDistance();

        assertEquals(expectedDistance, actualDistance, 0.001);
    }
}
