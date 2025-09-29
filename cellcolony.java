import java.util.*;

class cellcolony{
    public static void main(String args[]){
    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int temp[] = new int[n];
       

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
         int day = sc.nextInt();
         while(day!=0){
        for(int i=0;i<n;i++){
            int left = (i==0)?0:arr[i-1];
            int right = (i==7)?0:arr[i+1];
            temp[i] = left ^ right ;
        }

        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }

        day--;       
                    }

    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }

    }
}