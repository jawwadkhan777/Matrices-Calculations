package DataStructers;
import java.util.Scanner;
public class MatricesMultiplication {
    public static void main(String[] args) {
        System.out.println("RESTRICTION: Multiplication of matrices performs only\nwhen columns of first matrix must be equal to rows of second matrix(i.e. rxc=3x2,2x1).");
        Scanner sc = new Scanner(System.in);
        System.out.println("-------Input of matrix A-------");
        System.out.print("Enter rows of matrix A: ");
        int rA = sc.nextInt();
        System.out.print("Enter columns of matrix A: ");
        int cA = sc.nextInt();
        int [][] A = new int[rA][cA];
        for(int i=0; i<rA; i++){
            for (int j=0; j<cA; j++){
                System.out.printf("Value at "+i+":"+j+" = ");
                A [i][j]= sc.nextInt();
            }
        }
        System.out.println("-------Input of matrix B-------");
        System.out.print("Enter rows of matrix B: ");
        int rB = sc.nextInt();
        if (cA==rB) {
            System.out.print("Enter columns of matrix B: ");
            int cB = sc.nextInt();
            int[][] B = new int[rB][cB];
            for (int i = 0; i < rB; i++) {
                for (int j = 0; j < cB; j++) {
                    System.out.printf("Value at " + i + ":" + j + " = ");
                    B[i][j] = sc.nextInt();
                }
            }
            int S = 0;
            System.out.println("-------Multiplication of matrices-------");
            int[][] C = new int[rA][cB];
            for (int i = 0; i <= rA - 1; i++) {
                for (int j = 0; j <= cB - 1; j++) {
                    for (int k = 0; k <= rA; k++) {
                        S = S + (A[i][k] * B[k][j]);
                        C[i][j] = S;
                    }
                    S = 0;
                }
            }
            System.out.println("After multiplication of Matrices A and B resulting matrix C is:");
            for (int i = 0; i < rA; i++) {
                for (int j = 0; j < cB; j++) {
                    System.out.print(C[i][j] + " ");
                }
                System.out.println();
            }
        }
        else {
            System.out.println("Invalid input, must read the instructions carefully and try again. Thanks!!!");
        }
    }
}
