class Solution {
    public boolean judgeCircle(String moves) {
        int L = 0;
        int R = 0;
        int U = 0;
        int D = 0;
        for(int i =0 ; i< moves.length();i++){
            if(moves.charAt(i)=='L')
                R--;
            else if(moves.charAt(i)=='R')
                R++;
            else if(moves.charAt(i)=='U')
                D--;
            else if(moves.charAt(i)=='D')
                D++;
           
        }
       return R==0 && D==0;          
    }
}