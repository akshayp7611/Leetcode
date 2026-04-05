class Solution {
    public long minHour(int s,int [] piles){
    long sum=0;
        for(int i=0;i<piles.length;i++){
           sum+=piles[i]/s;
           if(piles[i]%s!=0){
            sum++;
           }
        }
        return sum;
    }
    public int minEatingSpeed(int[] piles, int h) {
        
        int low=1;
        int high=0;
        for(int i=0;i<piles.length;i++){
            if(piles[i]>high){
                high=piles[i];
            }
        }
        int res=-1;
        while(low<=high){
            int guess= low+(high-low)/2;
             long hour=minHour(guess,piles);
            if(hour>h){
                low=guess+1;
            }else{
                res=guess;
                high=guess-1;
            }
        }
        return res;
    }
}