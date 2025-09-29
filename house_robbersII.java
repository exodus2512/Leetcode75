import java.util.*;
public class house_robbersII {
    public static int rob(int[] nums, int start, int end) {
        int prev2 = 0, prev1 = 0, curr = 0;
        for(int i = start; i < end; i++) {
            curr = Math.max(prev1, prev2 + nums[i]);
            prev2 = prev1;
            prev1 = curr;
        }
        return curr;
    }
    public static int func(int[] nums) {
        if(nums.length == 1) return nums[0];
        // Rob houses 0 to n-2
        int first = rob(nums, 0, nums.length-1);
        // Rob houses 1 to n-1
        int last = rob(nums, 1, nums.length);
        return Math.max(first, last);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print(func(nums));
    }
}
