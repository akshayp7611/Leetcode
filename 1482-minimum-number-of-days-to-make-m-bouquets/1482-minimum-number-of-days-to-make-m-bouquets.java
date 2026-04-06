class Solution {
    public int makeBouquets(int[] nums,int guess, int k){
        
        int count=0;
        int res=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=guess){
                count++; 
            }else{
                count=0;
            }
            if(count==k){
             count=0;
              res++;
            }
            
        }
        return res;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n= bloomDay.length;
        int low =Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        int res=-1;

        for(int i=0;i<n;i++){
            if(bloomDay[i]<low){
                low=bloomDay[i];
            }
            if(bloomDay[i]>high){
                high=bloomDay[i];
            }
        }
       
       while(low<=high){

        int guess= low+(high-low)/2;

        int temp= makeBouquets(bloomDay,  guess, k);

        if(temp<m){
            low=guess+1;
        }else{
            res=guess;
            high=guess-1;
        }

       }

      return res;
    }

}