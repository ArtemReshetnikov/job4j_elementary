package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when56to34then282() {
        int x1 = 5;
        int y1 = 6;
        int x2 = 3;
        int y2 = 4;
        double expected = 2.82;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when142to98then781() {
        int x1 = 14;
        int y1 = 2;
        int x2 = 9;
        int y2 = 8;
        double expected = 7.81;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when41to51then1() {
        int x1 = 4;
        int y1 = 1;
        int x2 = 5;
        int y2 = 1;
        double expected = 1;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}