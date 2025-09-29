import java.util.Scanner;

public class arrayyyy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans=0,i=1;
        while((int)Math.pow(2, i)<=n){
            ans=(int)Math.pow(2, i);
            i++;
        }

        System.out.println((n-ans)*2+1);
        sc.close();
    }
}
