/* 14. Longest Common Prefix
 * Write a function to find the longest common prefix string amongst an array of strings. If there is no common prefix, return an empty string ""
 * Ekta Agrawal
 */

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        
        String prefix = strs[0];
        
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        
        return prefix;
    }
}

/*
Input: ["flower", "flow", "flight"]

First, we initialize prefix as "flower" since it's the first string in the input array.

Then, we iterate through the rest of the strings in the input array.

On the first iteration, we check if "flow" starts with "flower". Since it does not, we remove the last character from prefix, resulting in "flowe". We continue this process until "flow" does start with "flowe".

On the second iteration, we check if "flight" starts with "flowe". Since it does not, we remove the last character from prefix again, resulting in "flow". We continue this process until "flight" starts with "flow".

Once we have finished iterating through all the strings, we return the final value of prefix, which is "flow".

Output: "flow"

So, the longest common prefix of the input strings is "flow".
*/
