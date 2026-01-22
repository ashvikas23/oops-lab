import java.io.*;
import java.util.*;

class matrixaddition {
    public static void main(String[] args) {
        int r1, r2, c1, c2, i, j;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of matrix A:");
        r1 = sc.nextInt();
        c1 = sc.nextInt();

        System.out.println("enter size of matrix B:");
        r2 = sc.nextInt();
        c2 = sc.nextInt();

        int a[][] = new int[r1][c1];
        int b[][] = new int[r2][c2];
        int c[][] = new int[r1][c1];

        System.out.println("enter elements of matrix A:");
        for (i = 0; i < r1; i++) {
            for (j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("enter elements of matrix B:");
        for (i = 0; i < r2; i++) {
            for (j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        if (r1 == r2 && c1 == c2) {
            for (i = 0; i < r1; i++) {
                for (j = 0; j < c1; j++) {
                    c[i][j] = a[i][j] + b[i][j];
                }
            }

            System.out.println("Resultant matrix is:");
            for(i=0;i<r1;i++) {
            	for(j=0;j<c1;j++) {
        System.out.print(c[i][j] + " ");
    }
    System.out.println();
}

        } else {
            System.out.println("matrix addition is not possible !!");
        }
    }
}
