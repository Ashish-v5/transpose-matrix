package com.epam.rd.autotasks.matrices;
import java.util.Arrays;

public class TransposeMatrix {
    public static int[][] transpose(int[][] matrix) {
        int row=matrix.length;
        int column=matrix[0].length;
        int[][] trans = new int[column][row];

        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                trans[j][i]=matrix[i][j];
            }
        }
        return trans;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        int[][] matrix =  {
                {0, 1, 2},
                {3, 4, 5},
                {6, 7, 8}
        };

        int[][] result = transpose(matrix);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }

}
