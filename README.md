## Matrix transposition

You are given an integer matrix represented as *rectangular array*. 
The task is to *transpose* a given matrix over its main diagonal. 
The *transposition* of a matrix over its main diagonal is simply a flipped version of the original matrix. 
We can transpose a matrix over its main diagonal by switching its rows with its columns.

The main method located in [`com.epam.rd.autotasks.matrices.TransposeMatrix`](src/main/java/com/epam/rd/autotasks/matrices/TransposeMatrix.java)
and called `transpose`:
- takes a rectangular integer matrix on input;
- returns transposed rectangular matrix from the given matrix.

> **Note:** You can use the standart  *.length()* function, but no third party libraries to solve this task.

**Example:**

    Input:  {
              {0, 1, 2}, 
              {3, 4, 5}, 
              {6, 7, 8}
            };

    Output: {
              {0, 3, 6}, 
              {1, 4, 7}, 
              {2, 5, 8}
            };