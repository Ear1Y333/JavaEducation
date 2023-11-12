package OOP_Pracrice.Task2;

public class Matrix {
    private int[][] matrix;

    public Matrix(int[][] matrix) {
        this.matrix = matrix;
    }





    public int [][] multiplication_of_a_number(int n){
        for (int j=0; j<matrix.length; j++) {
            for (int i=0; i<matrix.length; i++) {
                matrix[j][i]*=n;
            }
        }
        return matrix;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void outputMatrix() {
        for (int [] array1: matrix) {
            for (int number : array1) {
                System.out.print(number + "  ");
            }
            System.out.print("\n");
        }
    }
}
