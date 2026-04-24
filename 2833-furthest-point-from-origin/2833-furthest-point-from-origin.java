class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int L = 0;
        int R = 0;
        int any = 0;
        for(int i =0 ; i< moves.length();i++){
            if(moves.charAt(i)=='L')
                L++;
            else if(moves.charAt(i)=='R')
                R++;
            else
                any++;
           
        }
        if(L>=R)
                return L-R+any;
        else
                return R-L+any;
    }
}