class Solution {
    public int mirrorDistance(int n) {
        int res = 0;
        int ori = n;
        while(n!=0){
            int temp = n%10;
            res = res*10+temp;
            n = n/10; 
        }
        return Math.abs(ori-res);
    }
}