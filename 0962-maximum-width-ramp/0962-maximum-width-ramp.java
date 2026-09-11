

class Solution {
    public int maxWidthRamp(int[] nums) {
        int n = nums.length;
        
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i]; 
            arr[i][1] = i;      
        }
        
        Arrays.sort(arr, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
      
        int ans = 0;
        int minIndex = arr[0][1];
        
        for (int i = 1; i < n; i++) {
            ans = Math.max(ans, arr[i][1] - minIndex);
            minIndex = Math.min(minIndex, arr[i][1]);
        }
        
        return ans;
    }
}
