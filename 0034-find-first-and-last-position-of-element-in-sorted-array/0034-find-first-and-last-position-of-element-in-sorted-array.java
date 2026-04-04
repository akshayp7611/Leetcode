class Solution {

    //first position
    public int firstPosition(int []arr,int target){
        int res=-1;
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int guess= low+ (high-low)/2;

            if(arr[guess]<target){
                low=guess+1;
            }else if(arr[guess]>target){
                high=guess-1;
            }else{
                res=guess;
                high=guess-1;
            }
        }
        return res;
    }
  //last Position 
   public int lastPosition(int []arr,int target){
        int res=-1;
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int guess= low+ (high-low)/2;

            if(arr[guess]<target){
                low=guess+1;
            }else if(arr[guess]>target){
                high=guess-1;
            }else{
                res=guess;
                low=guess+1;
            }
        }
        return res;
    }


    public int[] searchRange(int[] nums, int target) {
       int [] res= new int[2];
      res[0]= firstPosition(nums,target);
      res[1]= lastPosition(nums,target);
       return res;
    }
}