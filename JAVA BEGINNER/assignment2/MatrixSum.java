package assignment2;

public class MatrixSum {
    public static void main(String[] args) {
        int[][] matrix1 = { { 10, 20, 10, 70 },
                { 90, 110, 50, 40 },
                { 60, 00, 130, 170 },
                { 70, 210, 140, 150 } };

        int[][] matrix2 = { { 3, 2, 1, 7 },
                { 9, 11, 5, 4 },
                { 6, 0, 13, 17 },
                { 7, 21, 14, 15 } };

        int [][] result = new int[4][4];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(" "+result[i][j] +" ");
            }
            System.out.println("\n");
        }
    }
}
