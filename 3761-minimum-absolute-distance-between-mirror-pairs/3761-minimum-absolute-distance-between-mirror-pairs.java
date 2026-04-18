class Solution {
    public int minMirrorPairDistance(int[] nums) {
        
        Map<Integer, Integer> map = new HashMap<>(); // value -> latest index
        int minDist = Integer.MAX_VALUE;

        for (int j = 0; j < nums.length; j++) {
            int rev = reverse(nums[j]);

            if (map.containsKey(nums[j])) {
                minDist = Math.min(minDist, j - map.get(nums[j]));
            }

            // always store/update latest index
            map.put(rev, j);
        }

        return minDist == Integer.MAX_VALUE ? -1 : minDist;
    }

    private int reverse(int x) {
        int rev = 0;
        while (x > 0) {
            rev = rev * 10 + (x % 10);
            x /= 10;
        }
        return rev;
    }
    
}