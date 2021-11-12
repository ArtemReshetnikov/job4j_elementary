package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortThree() {
        int[] data = new int[] {56, 54, 55};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {54, 55, 56};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortFive() {
        int[] data = new int[] {9, 4, 2, 1, 7};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 4, 7, 9};
        Assert.assertArrayEquals(expected, result);
    }
}