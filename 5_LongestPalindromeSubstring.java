/* 5. Longest Palindromic Substring
 * Given a string s, return the longest palindromic substring in s.
 * Ekta Agrawal
 */

class Solution {
    public boolean isPalindrome (String str) {
        int start = 0;
        int end = str.length()-1;

        while (start<end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public String longestPalindrome(String s) {
        if (s.length() <= 1){
            return s;
        }

        int maxLength = 1;
        String maxString = s.substring(0,1);

        for (int i=0; i<s.length(); i++) {
            for (int j=i+maxLength; j<=s.length(); j++) {
                if (j-i > maxLength && isPalindrome(s.substring(i,j))) {
                    maxLength = j-i;
                    maxString = s.substring(i,j);
                }
            }
        }
        return maxString;
    }
}
