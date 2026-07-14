class Solution {
    public boolean isPalindrome(int x) {
        int t=x;
        int rev=0;
        while(t>0){
          rev=rev*10+(t%10);
           t=t/10;
        }
        if(x==rev)
        return true;
        else
        return false;
        
    }
}