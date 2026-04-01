class Solution {
    public int findMiddleIndex(int[] nums) {
        
      long totalsum=0;
      for(int num: nums){
        totalsum+=num;
      }
      long leftsum=0;

      for(int i=0;i<nums.length;i++){

        long rightsum= totalsum-leftsum - nums[i];

        if(rightsum==leftsum){
            return  i;
        }


        leftsum += nums[i];
      
      }
      
     return -1;
    }
}