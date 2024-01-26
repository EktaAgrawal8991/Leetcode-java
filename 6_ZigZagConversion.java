/* 6. Zigzag Conversion
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
    P   A   H   N
    A P L S I I G
    Y   I   R
    And then read line by line: "PAHNAPLSIIGYIR"
    Write the code that will take a string and make this conversion given a number of rows: string convert(string s, int numRows);
 * Ekta Agrawal
 */

class Solution {
    public String convert(String s, int numRows) {
        if (s==null || s.isEmpty() || numRows<=0) {
            return "";
        }

        if (numRows == 1) {
            return s;
        }

        //result is a a StringBuilder to store the converted string
        StringBuilder result = new StringBuilder();

        //step is the pattern step size, which is calculated as 2*numRows-2 (4 in this case)
        int step = 2*numRows-2;

        for (int i=0; i<numRows; i++) {
            for (int j=i; j<s.length(); j=j+step) {
                result.append(s.charAt(j));
                if (i!=0 && i!=numRows-1 && (j+step-2*i)<s.length()) {
                    result.append(s.charAt(j+step-2*i));
                }
            }
        }
        return result.toString();
    }
}

/* 
Example: Input: s = "PAYPALISHIRING", numRows = 3

1.We start by initializing the necessary variables:
  result: a StringBuilder to store the converted string
  step: the pattern step size, which is calculated as 2*numRows-2 (4 in this case)
2.We iterate through each row starting from row 0 to numRows-1:
  In the first iteration (i=0), we start with "P" at index 0 in string "s".
   each row iteration, we use a nested loop to iterate through the string with a step size of "step".
3.In the nested loop, we append the character at index "j" to the "result" StringBuilder.
  For the first iteration in row 0, we add "P" to the "result".
4.For all non-corner rows (i != 0 and i != numRows-1), we also append the character at index "j+step-2*i" to the "result".
  In the first iteration in row 0, we calculate (0+4-2*0) = 4, and append "A" from index 4 to the "result".
5.After completing all iterations, we convert the "result" StringBuilder to a string and return it as the final output.

Output: "PAHNAPLSIIGYIR"
 */
