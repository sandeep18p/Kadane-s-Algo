public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, -3, 2, 1, -1};
        int maxSum = solution.maxSubArray(nums);
        System.out.println("The maximum subarray sum is: " + maxSum);
    }
}

class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            max = Math.max(sum, max);
            if (sum < 0) {
                sum = 0;
            }
        }
        
        return max;
    }
}
