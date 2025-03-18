class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int i = 0;
        int j = n-1;
        int idx = n-1;
        while(i <= j){
            if(Math.abs(nums[i]) > Math.abs(nums[j])){
                arr[idx] = nums[i] * nums[i];
                i++;
            }else{
                arr[idx] = nums[j] * nums[j];
                j--;
            }
            idx--; 
        }
        return arr;
    }
}