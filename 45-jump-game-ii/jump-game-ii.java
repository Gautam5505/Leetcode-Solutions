class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;
        for (int i = 0; i < n-1; i++){
            farthest = Math.max(farthest, i + nums[i]);
            if(i == currentEnd){
                //i++;
                currentEnd = farthest;
                //if(currentEnd >= n-1);
                jumps++;
            }
        }
        return jumps;
    }
}