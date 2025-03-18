class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        HashSet<Integer> st = new HashSet<>();
        for(int i = 0; i< n; i++){
            st.add(nums[i]);
        }
        for(int i = 1; i<= n; i++){
            if(!st.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}