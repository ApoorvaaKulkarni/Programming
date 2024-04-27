public class MaximumSub {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 34, 66, 2};
        int res = maxSubArray(nums);
        System.out.println(res);
    }

    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

}
