package ru.job4j;

public class TriangleMatrix {
    public static int[][] rows(int count) {
        int[][] triangle = new int[count][];
        int temp = 1;
        for (int i = 0; i < count; i++) {
            triangle[i] = new int[i + 1];
            for (int j = 0; j < triangle[i].length; j++) {
                if (i > 0) {
                    temp++;
                    triangle[i][j] = temp;
                }
            }
        }
        return triangle;
    }
}