
import java.util.*;
public class num_add {
  
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int num = sc.nextInt();
       if(num%9==0){
        System.out.print(9);
       } else{
        System.out.print(num%9);
       }
        sc.close();
    }


    // public static int add(int num){
    //     int sum = 0;
    //     while(num>0){
    //         sum += num%10;
    //         num = num/10;
    //     }
    //     return sum;
    }
}
