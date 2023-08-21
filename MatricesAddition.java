package DataStructers;
import java.util.Scanner;

public class MatricesAddition {
    public static void main(String[] args) {
        System.out.println("RESTRICTION: A matrix can only be added to another matrix\nif the two matrices have the same dimensions.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows (both matrices): ");
        int r = sc.nextInt();
        System.out.print("Enter the number of columns (both matrices): ");
        int c = sc.nextInt();
        System.out.println("-------Input of matrix A-------");
        int [][] A = new int[r][c];
        for(int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                System.out.printf("Value at "+i+":"+j+" = ");
                A [i][j]= sc.nextInt();
            }
        }
        System.out.println("-------Input of matrix B-------");
        int [][] B = new int[r][c];
        for(int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                System.out.printf("Value at "+i+":"+j+" = ");
                B [i][j]= sc.nextInt();
            }
        }
        System.out.println("------Addition of matrices-------");
        System.out.println("After addition of Matrices A and B resulting matrix C is:");
        int [][] C = new int[r][c];
        for(int i = 0; i <= r-1; i++) {
            for(int j = 0; j <= c-1; j++) {
                C[i][j]=A[i][j]+B[i][j];
            }
        }
        for(int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                System.out.print(C[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
