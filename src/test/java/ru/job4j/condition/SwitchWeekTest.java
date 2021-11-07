package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SwitchWeekTest {

    @Test
    public void when4ThenThursday() {
        int day = 4;
        String expected = "Четверг";
        String out = SwitchWeek.nameOfDay(day);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void when10ThenError() {
        int day = 10;
        String expected = "Ошибка";
        String out = SwitchWeek.nameOfDay(day);
        Assert.assertEquals(expected, out);
    }
}