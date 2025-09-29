import java.util.*;
public class jochuva {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Scanner sc = new Scanner(System.in);
        int n ;
           n = sc.nextInt();
        int[] arr = new int[n];
     int sum =0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
              sum += arr[i];
        }
        for(int i=0;i<n;i++){
        sum -= arr[i];
         System.out.print( sum+ " ");
        }      
    }
}
