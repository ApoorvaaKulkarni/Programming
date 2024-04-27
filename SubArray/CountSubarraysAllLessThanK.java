public class CountSubarraysAllLessThanK {
    public int countSubarrays(int[] nums, int k) {
        int count = 0;
        int start = 0;
        for (int end = 0; end < nums.length; end++) {
            if (nums[end] < k) {
                count += (end - start + 1);
            } else {
                start = end + 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        CountSubarraysAllLessThanK solution = new CountSubarraysAllLessThanK();
        int[] nums = {1, 2, 3};
        int k = 4;
        System.out.println("Number of subarrays with all elements less than "
                + k + ": " + solution.countSubarrays(nums, k));
    }
}
