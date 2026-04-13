class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {

            // Check left side (start - i)
            if (start - i >= 0 && nums[start - i] == target) {
                return i;
            }

            // Check right side (start + i)
            if (start + i < n && nums[start + i] == target) {
                return i;
            }
        }

        return -1; // Not needed as per problem (target always exists)
    }
}