class Solution {
    public int[] findErrorNums(int[] nums) {
        int i = 0;
        Arrays.sort(nums);
        int[] ans = new int[2];
        int n = nums.length;
        int total = n*(n+1)/2;
        int dup = -1;
        int count = 0;

        for(i = 0; i< nums.length-1;i++){
            if(nums[i]==nums[i+1]){
               dup = nums[i];
            }
            count = count + nums[i];
        }
        count = count+nums[n-1];
        int dif = total-count;
        int miss = dif+dup;
        ans[0]= dup;
        ans[1]= miss;
        return ans;
    }
}