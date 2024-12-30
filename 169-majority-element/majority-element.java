class Solution {
    public int majorityElement(int[] nums) {
        int majority = nums[0], arr = 1;// We can also write votes in place of arr
        for(int i = 1; i < nums.length; i++){
            if (arr == 0) {
                arr++;
                majority = nums[i];
            }
            else if (majority == nums[i]){
                arr++;
            }
            else
                arr--;
        }
        return majority;
    }
}