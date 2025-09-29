import java.util.*;
class RearrangeSign {
       
public static void main(String[] args) {    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] nums = new int[n];
    for(int i =0;i<n;i++){
        nums[i] = sc.nextInt();
    }
    System.out.println(Arrays.toString(rearrangeArray(nums)));
    sc.close();
}
    //NOTE -------> when manipulation the pos of array......
    //....nums the original arraya gets changed and hence values are lost
    //hence we create a new array ans and store the values in it and return it

    public static int[] rearrangeArray(int[] nums) {      
            int odd =0; //2,
            int even=1;
            int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){       
                if(nums[i]>0){  
                ans[odd]  =  nums[i];
                odd+=2;
            }        
            else if (nums[i]<0){
                ans[even] = nums[i];
                even += 2;
            }      
        }    
        return ans;      
    }                           
}                      
