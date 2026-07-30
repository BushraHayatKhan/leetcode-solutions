import java.util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int c = 0;
        char s1[] = s.toCharArray();
        char t1[] = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        for (int i = 0; i < s.length(); i++) {
            if (s1[i] == t1[i]) {
                c++;
            }
        }
        if (c == s.length())
            return true;
        else
            return false;
    }
}