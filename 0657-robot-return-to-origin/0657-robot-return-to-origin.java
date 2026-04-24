class Solution {
    public boolean judgeCircle(String moves) {
        int L = 0;
        int R = 0;
        int U = 0;
        int D = 0;
        for(int i =0 ; i< moves.length();i++){
            if(moves.charAt(i)=='L')
                L++;
            else if(moves.charAt(i)=='R')
                R++;
            else if(moves.charAt(i)=='U')
                U++;
            else if(moves.charAt(i)=='D')
                D++;
           
        }
       if((L-R)==0&&(U-D)==0)
            return true;
    return false;
    }
}