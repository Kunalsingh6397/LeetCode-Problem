class Solution {
    public int[] searchRange(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        int[] ans={-1,-1};
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==target && mid==0){
                ans[0]=0;
                break;
            }
            else if(nums[mid]==target && nums[mid-1]!=target){
                ans[0]=mid;
                break;
            }
            else if(nums[mid]==target && nums[mid-1]==target){
                e=mid-1;
            }
            else if(nums[mid]>target){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        s=0;
        e=nums.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==target && mid==nums.length-1){
                ans[1]=mid;
                break;
            }
            else if(nums[mid]==target && nums[mid+1]!=target){
                ans[1]=mid;
                break;
            }
            else if(nums[mid]==target && nums[mid+1]==target){
                s=mid+1;
            }
            else if(nums[mid]>target){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }

        return ans;
    }
}