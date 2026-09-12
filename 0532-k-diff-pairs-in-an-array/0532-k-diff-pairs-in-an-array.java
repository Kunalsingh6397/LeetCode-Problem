public class Solution {
    public int findPairs(int[] nums, int k) {
        if (k < 0) return 0; 
        Arrays.sort(nums); 
        int left = 0, right = 1, count = 0;
        while (right < nums.length) {
            if (left == right || nums[right] - nums[left] < k) {
                right++;
            } else if (nums[right] - nums[left] > k) {
                left++;
            } else{
                count++;
                left++;
                right++;
                while (right < nums.length && nums[right] == nums[right - 1]) {
                    right++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {3, 1, 4, 1, 5};
        int k = 2;
        System.out.println(sol.findPairs(nums, k));
    }
}
