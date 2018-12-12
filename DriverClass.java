/*Chandler Phillips
  CSC 515 Homework 4
  3/12/18*/
public class DriverClass extends MyMatrix {

    public static void main(String[] args) {
        int counter = 0;
        float[][] matrix1 = new float[2][2];
        matrix1[0][0] = 1;
        matrix1[0][1] = 2;
        matrix1[1][0] = 3;
        matrix1[1][1] = 4;

        float[][] matrix2 = new float[2][2];
        matrix2[0][0] = 5;
        matrix2[0][1] = 6;
        matrix2[1][0] = 7;
        matrix2[1][1] = 8;

        for (int i = 0; i < matrix1.length; i++) {
            counter++;
            if (counter == 1) {
                System.out.println("Matrix 1 before modification:");
            }
            for (int j = 0; j < matrix1[0].length; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        counter = 0;

        for (int i = 0; i < matrix2.length; i++) {

            counter++;
            if (counter == 1) {
                System.out.println("Matrix 2 before modification:");
            }
            for (int j = 0; j < matrix2[0].length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        addScalarMatrix(matrix1, 3);
        System.out.println();
        System.out.println();
        subtractScalarMatrix(matrix1, 3);
        System.out.println();
        System.out.println();
        addMatrices(matrix1, matrix2);
        System.out.println();
        System.out.println();
        subtractMatrices(matrix1, matrix2);
        System.out.println();
        System.out.println();
        multiplyScalarMatrix(matrix1, 2);
        System.out.println();
        System.out.println();
        multiplyMatrices(matrix1, matrix2);
    }
}
