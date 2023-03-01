package matrixmultiplication;

public class MatrixMultiplication implements Runnable{

    private int id, j;
    private int c[][], f[][];
    private int res = 0;
    private int C [][] = {};


    public MatrixMultiplication(int id, int j, int[][] c, int[][] f, int[][] C) {

        this.id = id;
        this.j = j;
        this.c = c; // collumns
        this.f = f; // fila
        this.C = C;
    }

    @Override

    public void run() {
        for (int i = 0; i < f.length; i++) {
            res += c[id][i] * f[j][i];
        }
        C[id][j] = res;
    }
}
