import java.util.*;
public class rev_int {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum=0,digit=0,rev=0,sum_rev=0;
    while(n!=0){
        digit = n%10;
        sum = sum*10+digit;
        n = n/10;
        
    }

   while(sum!=0) {
    sum_rev = sum%100;
        rev = rev*100 + sum_rev;
        sum = sum/100; 
   }
    System.out.println(rev);    
    sc.close();
}

}
