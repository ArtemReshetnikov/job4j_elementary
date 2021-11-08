package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromFiftyToFiftyOneThenOneHundredTwo() {
        int start = 50;
        int finish = 52;
        int result = Counter.sumByEven(start, finish);
        int expected = 102;
        Assert.assertEquals(expected, result);
    }
}