public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int left = i + 1, right = nums.length - 1; left < right;) {
                int sum = nums[i] + nums[left] + nums[right];
                
                if (sum > 0) {
                    right--;
                } else if (sum < 0) {
                    left++;  
                } else {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    for ( ; left < right && nums[left] == nums[left + 1]; left++);
                    for ( ; left < right && nums[right] == nums[right - 1]; right--);
                    left++;
                    right--;
                }
            }
        }
        return result;
    }
    
}
