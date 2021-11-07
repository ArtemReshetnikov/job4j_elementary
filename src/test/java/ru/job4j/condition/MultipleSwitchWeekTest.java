package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MultipleSwitchWeekTest {

    @Test
    public void when7ThenSunday() {
        String name = "Sunday";
        int expected = 7;
        int out = MultipleSwitchWeek.numberOfDay(name);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenHelloThenMinusOne() {
        String name = "Hello";
        int expected = -1;
        int out = MultipleSwitchWeek.numberOfDay(name);
        Assert.assertEquals(expected, out);
    }
}