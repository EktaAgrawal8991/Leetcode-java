/* 3. Longest Substring Without Repeating Characters
 * Given a string s, find the length of the longest substring without repeating characters.
 * Ekta Agrawal
 */

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> hs = new HashSet<>();
        int i = 0, ans = 0;

        for (int j=0; j<s.length(); j++) {
            char ch = s.charAt(j);
            while (hs.contains(ch)) {
                hs.remove(s.charAt(i));
                i++;
            }
            hs.add(ch);
            ans = Math.max(ans, j-i+1);
        }
        return ans;
    }
}
