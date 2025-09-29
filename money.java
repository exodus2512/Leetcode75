import java.util.Scanner;

public class money {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int sum = 0,   k=0;
        while(sum+(k+1) <=n){
            k++;
            sum+=k;
        }
        System.out.println("output:"+" "+(k-1));
    }   
}
