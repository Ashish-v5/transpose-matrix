package com.epam.rd.autotasks.matrices;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TransposeMatrixTests {
    @Test
    public void test2x2_1() {
        int[][] a = { {1, 2}, {7, -13} };
        int[][] expected = transpose(a);
        int[][] actual = TransposeMatrix.transpose(a);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2x2_2() {
        int[][] a = { {-4, -65}, {78, -13} };
        int[][] expected = transpose(a);
        int[][] actual = TransposeMatrix.transpose(a);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2x3_1() {
        int[][] a = { {-4, -65, 56}, {78, -13, 32} };
        int[][] expected = transpose(a);
        int[][] actual = TransposeMatrix.transpose(a);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2x3_2() {
        int[][] a = { {-24853, -643535, 5687654}, {7248, 4213, 32} };
        int[][] expected = transpose(a);
        int[][] actual = TransposeMatrix.transpose(a);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test3x2_1() {
        int[][] a = { {-643535, 5687654}, {4213, 32}, {-345657, 0} };
        int[][] expected = transpose(a);
        int[][] actual = TransposeMatrix.transpose(a);
        Assertions.assertArrayEquals(expected, actual);
    }

    public static int[][] transpose(int[][] a) {

        int transpose[][]= new int[a[0].length][a.length];

        for (int i = 0; i < a[0].length; i++)
            for (int j = 0; j < a.length; j++)
                transpose[i][j] = a[j][i];

        return transpose;
    }
}