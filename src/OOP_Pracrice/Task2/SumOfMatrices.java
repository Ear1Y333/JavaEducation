package OOP_Pracrice.Task2;

public class SumOfMatrices {
    public static void sumOfMatrices(int[][] matrix, int [][] matrix2) {
        if (matrix2.length == matrix.length && matrix2[0].length == matrix[0].length) {
            for (int j = 0; j < matrix.length; j++) {
                for (int i = 0; i < matrix.length; i++) {
                    System.out.print(matrix[j][i] + matrix2[j][i] + "  ");
                }
                System.out.print("\n");
            }
        }else {
            System.out.println("Incorrect input");
        }
    }
}
