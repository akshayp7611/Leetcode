class Solution {
    public int  searchBinaryPart(int [] nums,int low ,int high ,int target){
        
        while(low<=high){
            int guess= low+(high-low)/2;

            if(nums[guess]==target){
                return guess;
            }else if(nums[guess]>target){
                high=guess-1;
            }else{
                low=guess+1;
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int low =0;
        int high=nums.length-1;
        int res=0;
        while(low<=high){
            int guess= low +(high-low)/2;
             
            if(nums[guess]>nums[nums.length-1]){
                low=guess+1;
            }else{
            
                  res=guess; 
                high=guess-1;
            }
        }

         int ans1  =  searchBinaryPart(nums, 0, res-1, target);
         int ans2  =  searchBinaryPart(nums, res, nums.length-1,target);
     if (ans1 != -1) {
            return ans1;
        }
        return ans2;
    }
}