import java.util.*;
class temple_flowers{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dou =0,k=0,i=0,s,flag=0;
        while(n>0){
            dou=n*2;
            s=(int)Math.pow(2, i);
            k=(dou/2)+(s*3);
            n=dou-k;
            if(n<0){
            flag=1;
            break;
            }
            i++;
        }
      if(flag==1){
        System.out.println("No solution");
      }
      else {
        System.out.println(k+" "+n);
      }
    }
}