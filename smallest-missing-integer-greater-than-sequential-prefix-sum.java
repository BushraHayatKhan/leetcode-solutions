class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;
        int sum = nums[0];
        int i = 1;
        while (i < n && nums[i] == nums[i - 1] + 1) {
            sum += nums[i];
            i++;
        }
        int x = sum;
        while (true) {
            boolean found = false;
            for (int j = 0; j < n; j++) {
                if (nums[j] == x) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return x;
            }
            x++;
        }
    }
}