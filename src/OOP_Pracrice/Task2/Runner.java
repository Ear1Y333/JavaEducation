package OOP_Pracrice.Task2;

public class Runner {
    public static void main(String[] args) {
        int [][] matrix =  {{1,4,5,-1},
                            {3,1,2,4},
                            {12,2,6,3},
                            {7,1,4,5}};
        Matrix matrix1 = new Matrix(matrix);
       // matrix1.getMatrix();
        int [][] matrix_n = matrix1.multiplication_of_a_number(2);
        Matrix matrix2 = new Matrix(matrix_n);
       // matrix2.getMatrix();
        int [][] matrix3 =  {{1,4,5},
                            {3,1,2},
                            {12,2,6},
                            {7,1,4}};
        SumOfMatrices.sumOfMatrices(matrix1.getMatrix(), matrix2.getMatrix());


    }
}