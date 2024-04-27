public class LongestContinuousIncreasingSubarray {
    public int findLengthOfLCIS(int[] nums) {
        int maxLen = 0, len = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                len++;
            } else {
                maxLen = Math.max(maxLen, len);
                len = 1;
            }
        }
        return Math.max(maxLen, len);
    }

    public static void main(String[] args) {
        LongestContinuousIncreasingSubarray solution = new LongestContinuousIncreasingSubarray();
        int[] nums = {1, 3, 5, 4, 7};
        System.out.println("Length of longest continuous increasing subarray: " + solution.findLengthOfLCIS(nums));
    }
}
