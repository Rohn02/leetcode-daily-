class Solution {
    public int maxDistance(int[] colors) {
    //    int max1 = 0;
    //    int max2 = 0;
        int i = 0 ; 
        int j = colors.length-1 ; 
        int temp1=0;
        int temp2=0;
        while(i<=j){
            if(colors[i]!=colors[j]){
                temp1 =  j-i;
                break;
            }

            j--;
        }
        i = 0 ; 
        j = colors.length-1 ; 
        
        while(i<=j){
            if(colors[i]!=colors[j]){
                temp2 =  j-i;
                break;
            }
            i++;
        }
        
        return Math.max(temp1,temp2);
    }
}