package matrixmultiplication;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {

        int A[][] = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        int B[][] = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        int C[][] = new int[A.length] [B.length];
        int nElements = A.length * B.length;
        ExecutorService executor = Executors.newFixedThreadPool(nElements);

        for (int i = 0; i<A.length; i++) {
            for (int j = 0; j<B.length; j++) {
                executor.execute(new MatrixMultiplication (i, j, A, B, C));

            }
        }

        executor.shutdown();

        System.out.println(" checking matrix multiplication");
        System.out.println(toString(C));
    }

    public static String toString(int[][] C) {
        if (C == null) {
            return "Error";
        }
        int rowsC = C.length;
        int colsC = C[0].length;
        String output = "";
        for (int i = 0; i < rowsC; i++) {
            for (int j = 0; j < colsC; j++) {
                output += C[i][j] + " ";
            }

        output += "\n";

    }

    return output;

    }

}