class Solution {
    public int[] twoSum(int[] nums, int target) {
    
        int[] v = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                 if (nums[i] + nums[j] == target) {

                        v[0] = i;
                        v[1] = j;
                         return v;
                }

            }

        }

return v; 
    }
}