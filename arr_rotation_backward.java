public class arr_rotation_backward {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;  // 5
        int[] arr = new int[n];   //  [0,0,0,0,0]
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int rot = sc.nextInt();
        int rot1 = rot%n;

        while(n!=0){
                int temp=0;
                temp = arr[n-1];
                for(int i = n-1;i>0;i--){
                    arr[i] = arr[i-1];
                }
                arr[0] = temp;
                rot1--;
        }
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
