class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int bSatisfied = 0;
        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i] == 0) {
                bSatisfied += customers[i];
            }
        }
        int windowGain = 0;
        for (int i = 0; i < minutes; i++) {
            if (grumpy[i] == 1) {
                windowGain += customers[i];
            }
        }

        int maxGain = windowGain;

        for (int i = minutes; i < customers.length; i++) {
            if (grumpy[i] == 1) {
                windowGain += customers[i];
            }
            if (grumpy[i - minutes] == 1) {
                windowGain -= customers[i - minutes];
            }
            maxGain = Math.max(maxGain, windowGain);
        }

        return bSatisfied + maxGain;
    }
}