public class MinimumSub {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 34, 66, 2};
        int res = minSubArray(nums);
        System.out.println(res);
    }

    private static int minSubArray(int[] nums) {
        int minSum = nums[0];
        int currentSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.min(nums[i], currentSum + nums[i]);
            minSum = Math.min(minSum, currentSum);
        }
        return minSum;
    }
}
