class Solution {
    public boolean canJump(int[] nums) {
        int arr = 0;
        for (int i = 0; i <= arr; i++){
            arr = Math.max(arr, i + nums[i]);
            if(arr >= nums.length - 1){
                return true;
            }
        }
        return false;
    }
}