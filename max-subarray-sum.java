class Solution {
    public int maxSubArray(int[] nums) {
        int currSum=0;
        int c=0;
        int maxnegval=Integer.MIN_VALUE;
         int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
            c++;
            maxnegval=Math.max(nums[i],maxnegval); }}
        if(c==nums.length){
        return maxnegval;}
        else{
        for(int i=0;i<nums.length;i++){
            currSum=currSum+nums[i];
            if(currSum<0){
                currSum=0;
            }
            maxSum=Math.max(currSum,maxSum);
    }
        }
        return maxSum;
}
}  


