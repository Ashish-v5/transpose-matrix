## Matrix transposition

You are given an integer matrix represented as a **rectangular array**. 
The task is to **transpose** a given matrix over its main diagonal. 
The **transposition** of a matrix over its main diagonal is simply a flipped version of the original matrix. 
We can transpose a matrix over its main diagonal by switching its rows with its columns.

The correctness of the task will be checked using tests.

There are two classes:

1) [`com.epam.rd.autotasks.matrices.TransposeMatrix`](src/main/java/com/epam/rd/autotasks/matrices/TransposeMatrix.java) - class for you to write code. Contains methods:
    - `multiply` - takes a rectangular integer array (matrices) on **input** and **returns** a transposed rectangular array (matrix) from the given array (matrix).
    - `main` - method for you to run your code locally.
    
2) [`com.epam.rd.autotasks.matrices.TransposeMatrixTests`](src/test/java/com/epam/rd/autotasks/matrices/TransposeMatrixTests.java) - class for testing your code. It contains several tests you can run using:
    ```console
    $ mvn clean test
    ```
    To run particular test go to the [`TransposeMatrixTests.class`](src/test/java/com/epam/rd/autotasks/matrices/TransposeMatrixTests.java), choose the test and run command:
    ```console
    $ mvn clean test -Dtest=TransposeMatrixTests#<test_name>

> **Note:** 
>- You can use the standard  **.length** attribute, that determines the length of an array, but no third party libraries to solve this task.
>- You have to install Maven locally to run tests. You can download Maven from [download page][maven-download].

**Example:**

    Input:  {{0, 1, 2}, 
             {3, 4, 5}, 
             {6, 7, 8}}

    Output: {{0, 3, 6}, 
             {1, 4, 7}, 
             {2, 5, 8}}
[maven-download]: https://maven.apache.org/download.cgi