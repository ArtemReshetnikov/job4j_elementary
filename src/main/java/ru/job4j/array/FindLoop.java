package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rst = -1;
        for (int num = 0; num < data.length; num++) {
            if (data[num] == el) {
                rst = num;
                break;
            }
        }
        return rst;
    }

    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int num = start; num <= finish; num++) {
            if (data[num] == el) {
                rst = num;
                break;
            }
        }
        return rst;
    }
}