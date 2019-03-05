package matrix;

import java.util.Scanner;

import static java.lang.Math.abs;

public class MatrixAddSub {

        public static void main(String args[]) {
            int numrows;
            int numcols;
            int sum = 0;
            int sub = 0;
            int sub1 = 0;
            int sub2 = 0;
            System.out.println("Enter the number of rows");
            Scanner sc = new Scanner(System.in);
            numrows = sc.nextInt();
            System.out.println("enter the number of columns");
            numcols = sc.nextInt();
            int[][] matrix = new int[numrows][numcols];
            enterMatrixData(sc, matrix, numrows, numcols);
            printMatrix(matrix, numrows, numcols);
            addDiagonallr(matrix, numrows, numcols, sum);
            addDiagonalrl(matrix, numrows, numcols, sum);
            subBoth(matrix, numrows, numcols, sub, sub1, sub2);

        }


        public static void enterMatrixData(Scanner sc, int[][] matrix, int numrows, int numcols) {
            System.out.println("Enter the matrix");
            for (int i = 0; i < numrows; i++) {
                for (int j = 0; j < numcols; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
        }

        public static void printMatrix(int[][] matrix, int numrows, int numcols) {
            System.out.println("The matrix u enterd is :");
            for (int i = 0; i < numrows; i++) {
                for (int j = 0; j < numcols; j++) {
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }
        }

        public static void addDiagonallr(int[][] matrix, int numrows, int numcols, int sum) {
            System.out.println("the sum is: ");
            for (int i = 0; i < numrows; i++) {
                for (int j = 0; j < numcols; j++) {

                    if (i == j) {
                        sum = sum + matrix[i][j];

                    }
                }

            }
            System.out.println(sum);
        }


        public static void addDiagonalrl(int[][] matrix, int numrows, int numcols, int sum) {
            System.out.println("the sum is ");
            for (int i = numrows - 1; i >= 0; i--) {
                for (int j = numcols - 1; j >= 0; j--) {
                    if (i == j) {
                        sum = sum + matrix[i][j];
                    }
                }
            }
            System.out.println(sum);
        }


        public static void subBoth(int[][] matrix, int numrows, int numcols, int sub, int sub1, int sub2) {
            System.out.println("the sub is ");
            for (int i = 0; i < numrows; i++) {
                for (int j = 0; j < numcols; j++) {
                    if (i == j) {
                        sub1 = abs(sub1 - matrix[i][j]);
                    }
                }
            }
            System.out.println(sub1);
            System.out.println("the sub is ");
            for (int i = numrows - 1; i >= 0; i--) {
                for (int j = numcols - 1; j >= 0; j--) {
                    if (i == j) {
                        sub2 = abs(sub2 - matrix[i][j]);
                    }
                }
            }
            System.out.println(sub2);
            System.out.println("the sub of both is");
            sub = abs(sub1 - sub2);
            System.out.println(sub);
        }
    }

