import java.util.*;
public class buy_sell_stock {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for(int i =0;i<n;i++){
            prices[i] = sc.nextInt();
        }
        System.out.println(BestTime(prices));
    }

    public static int BestTime(int[] prices){
            int buy=Integer.MAX_VALUE,profit=0;
            for(int i  : prices ){
                buy  = Math.min(buy,i);
                profit = Math.max(profit,i-buy) ;
            }

            return profit;
    }
    
}
