/* 10. Regular Expression Matching
 * Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' 
 * where:
 *   '.' Matches any single character.​​​​
 *   '*' Matches zero or more of the preceding element.
 *  The matching should cover the entire input string (not partial).
 */

//This code is an implementation of regular expression matching using dynamic programming.
class Solution {

    //The function isMatch takes in two strings, s and p, and returns a boolean indicating whether s matches the pattern defined by p.
    public boolean isMatch(String s, String p) {
        int len1 = s.length();
        int len2 = p.length();

        //Create a 2D boolean array dp, where dp[i][j] represents whether the substring of s from index 0 to i-1 matches the substring of p from index 0 to j-1.
        boolean[][] dp = new boolean[len1+1][len2+1];
          
        //dp[0][0] is set to true because an empty string matches another empty string.
        dp[0][0] = true;

        //The base cases are set in the first two loops of the code
        //dp[i][0] is set to false for i>0 because s can never match an empty pattern.
        for (int i=1; i<=len1; i++) {
            dp[i][0] = false;
        }

        //dp[0][j] is set based on the pattern p. If p[j-1] is '*', dp[0][j] is set to whether the pattern without the wildcard (p[j-2]) matches the empty string. Otherwise, dp[0][j] is set to false.
        for (int j = 1; j <= len2; j++) {
            if (p.charAt(j-1) == '*') {
                dp[0][j] = dp[0][j-2];
            } else {
                dp[0][j] = false;
            }
        }

        for (int i=1; i<=len1; i++) {
            for (int j=1; j<=len2; j++) {
                if (s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '.') {  ////This means the characters match. In this case, dp[i][j] is set to dp[i-1][j-1], which indicates whether the previous prefixes of s and p match.
                    dp[i][j] = dp[i-1][j-1];
                } else if (p.charAt(j-1) == '*') {  //p.charAt(j-1) == '*': This means the current pattern has a wildcard. In this case, dp[i][j] is set to dp[i][j-2], which indicates whether the previous prefix of p (without the wildcard) matches the current substring of s. Then, if the previous character of p (p.charAt(j-2)) matches the current character of s
                    dp[i][j] = dp[i][j-2];
                    if (s.charAt(i-1) == p.charAt(j-2) || p.charAt(j-2) == '.') {  //if p.charAt(j-2) is '.', dp[i][j] is also set to dp[i-1][j], which indicates whether the current character of s matches the previous prefix of p.
                        dp[i][j] = dp[i][j] || dp[i-1][j];
                    }
                } else {  //Otherwise, dp[i][j] is set to false because the characters do not match.
                    dp[i][j] = false;
                }
            }
        }
        return dp[len1][len2];  //Finally, the function returns dp[len1][len2], which indicates whether the entire string s matches the entire pattern p.
    }
}
