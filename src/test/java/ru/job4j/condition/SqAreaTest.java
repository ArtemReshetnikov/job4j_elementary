package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int p = 6;
        double k = 2;
        int expected = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP28K25Square40() {
        int p = 28;
        double k = 2.5;
        int expected = 40;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP3432K472Square4248() {
        double p = 34.32;
        double k = 4.72;
        double expected = 42.48;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}