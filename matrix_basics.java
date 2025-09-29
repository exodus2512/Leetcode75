import java.util.*;
import java.util.Scanner;

public class matrix_basics {
    public static void main(String[] args) {
    


int [][] matrix = { {1,2,3}, {4,5,6},{7,8,9}};

//row-wise traversal

for( int i =0;i<matrix.length ;i++) {
    for(int j =0 ; j<matrix[0].length; j++){

        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}
    }
}



import java.util.Scanner;
public class mat_max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("rows");
        int row = sc.nextInt();
        System.out.println("cols");
        int cols = sc.nextInt();
        int[][] mat = new int[row][cols];
        System.out.println("matrix elements");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int msum = 0;
        int mrow = 1;
        for (int i = 0; i < row; i++) {
            int sum = 0;
            for (int j = 0; j < cols; j++) {
                sum += mat[i][j];
            }
            System.out.println("Row " + (i + 1) + " sum = " + sum);
            if (i == 0 || sum > msum) {
                msum = sum;
                mrow = i + 1;
            }
        }
        System.out.println("Row " + mrow + " has the maximum sum = " + msum);
    }
}
