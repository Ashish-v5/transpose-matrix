package com.epam.rd.autotasks.matrices;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TransposeMatrixTests {

    @Test
    public void testSmth() {
        int[][] a = { {1, 2}, {7, -13} };
        int[][] expected = transpose(a);
        int[][] actual = TransposeMatrix.transpose(a);
        Assertions.assertArrayEquals(expected, actual);
    }

    public static int[][] transpose(int[][] a) {

        int transpose[][]= new int[a.length][a[0].length];

        for (int i = 0; i < a[0].length; i++)
            for (int j = 0; j < a.length; j++)
                transpose[i][j] = a[j][i];

        return transpose;
    }
}