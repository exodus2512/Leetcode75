import java.util.Scanner;

public class num_pattern {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);;
    int n = sc.nextInt();
     int  m = 2*n-1;
    int[][] mat = new int[m][m];
    
    for(int i=0;i<m;i++){
        for(int j=0;j<m;j++){
            int min =0;
            min= Math.min(Math.min(i,j),Math.min(m-1-i,m-1-j));  
            mat[i][j] = n-min;
            System.out.print(mat[i][j]+" ");
        }
        System.out.println();   
    }
        
    }
}


// import java.util.*;
// public class num_pattern {
//     public static int min(int a,int b,int c, int d){
//         int e= a<b?a:b;
//         int f= c<d?c:d;
//         return e<f?e:f;
//     }
//     public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);;
//     int n = sc.nextInt();
//     int c=0;
//   //   int  m = 2*n-1;
//     for(int i=0;i<2*n-1;i++,System.out.println()){
//         for(int j=0;j<2*n-1;j++){
//             c= min(i,j,(2*n-2)-i,(2*n-2)-j);
//             System.out.print(n-c+" ");
//         }
//     }   
//     }
// }
