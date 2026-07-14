class Solution {
    public int majorityElement(int[] nums) {
        int numb=(int)Math.floor((nums.length)/2);
        int curr=0;
        int c=0;
        for(int i=0;i<nums.length;i++){
        curr=nums[i];
        c=0;
        for(int j=i;j<nums.length;j++){
            if(curr==nums[j])
            c++;
        }
        if(c>numb)
        return curr;
    }
        return -1;
    
}
}
