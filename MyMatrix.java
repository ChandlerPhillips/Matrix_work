/*Chandler Phillips
  CSC 515 Homework 4
  3/12/18*/
public class MyMatrix {

    public static void addScalarMatrix(float[][] matrix, float scalar) {
        System.out.println("You are adding the scalar value to matrix 1:");
        float[][] newMatrix = new float[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                newMatrix[i][j] = matrix[i][j] + scalar;
            }
        }

        for (int i = 0; i < newMatrix.length; i++) {
            for (int j = 0; j < newMatrix[0].length; j++) {
                System.out.print(newMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void subtractScalarMatrix(float[][] matrix, float scalar) {
        System.out.println("You are subtracting the scalar value from matrix 1:");
        float[][] newMatrix = new float[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                newMatrix[i][j] = matrix[i][j] - scalar;
            }
        }

        for (int i = 0; i < newMatrix.length; i++) {
            for (int j = 0; j < newMatrix[0].length; j++) {
                System.out.print(newMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void addMatrices(float[][] matrixA, float[][] matrixB) {
        System.out.println("You are adding matrix 1 to matrix 2:");
        float[][] matrixC = new float[matrixA.length][matrixA[0].length];

        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        for (int i = 0; i < matrixC.length; i++) {
            for (int j = 0; j < matrixC[0].length; j++) {
                System.out.print(matrixC[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void subtractMatrices(float[][] matrixA, float[][] matrixB) {
        System.out.println("You are subtracting matrix 2 from matrix 1:");
        float[][] matrixC = new float[matrixA.length][matrixA[0].length];

        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                matrixC[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }
        for (int i = 0; i < matrixC.length; i++) {
            for (int j = 0; j < matrixC[0].length; j++) {
                System.out.print(matrixC[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void multiplyScalarMatrix(float[][] matrix, float scalar) {
        System.out.println("You are multplying the scalar and matrix 1:");
        float[][] newMatrix = new float[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                newMatrix[i][j] = matrix[i][j] * scalar;
            }
        }
        for (int i = 0; i < newMatrix.length; i++) {
            for (int j = 0; j < newMatrix[0].length; j++) {
                System.out.print(newMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void multiplyMatrices(float[][] matrixA, float[][] matrixB) {
        System.out.println("You are multiplying matrix 1 and matrix 2:");
        float[][] matrixC = new float[matrixA.length][matrixA[0].length];

        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[0].length; j++) {
                for (int k = 0; k < matrixB.length; k++) {
                    matrixC[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        for (int i = 0; i < matrixC.length; i++) {
            for (int j = 0; j < matrixC[0].length; j++) {
                System.out.print(matrixC[i][j] + " ");
            }
            System.out.println();
        }
    }
}
