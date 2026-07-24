class Solution {
    public int countsymmetricintegers(int low, int high) {
        int count = 0;
        for (int x = low; x <= high; x++) {
            String s = Integer.toString(x);
            int len = s.length();
            if (len % 2 != 0) continue;
            int n = len / 2;
            int sum1 = 0, sum2 = 0;
            for (int i = 0; i < n; i++) {
                sum1 += s.charAt(i) - '0';
            }
            for (int i = n; i < len; i++) {
                sum2 += s.charAt(i) - '0';
            }
            if (sum1 == sum2) { count++; }
        }
        return count;
    }
}