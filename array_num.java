import java.util.*;
public class array_num {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Scanner sc = new Scanner(System.in);
        int n ;
           n = sc.nextInt();  //5      0 1 2 3 4
        int[] arr = new int[n];  //   [0,0,0,0,0]

     int sum =0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();  // arr[0] = 10 => arr[1] = 20 => arr[2] = 30 ......  arr[4] = 50
              sum  = sum + arr[i];     // sum =0 => sum = 10  =>  ......sum = 150
        }
        // arr[0] = sum - arr[0];
        // System.out.print(arr[0]+" ");
        for(int i =0;i<n;i++){
    //    arr[i] = arr[i-1]-arr[i];       sum =140......sum=120......sum=90
        arr[i] = sum-arr[i];   // arr[0] = 140
              System.out.print( arr[i]+ " ");
              sum = arr[i];
        }      
    }
}