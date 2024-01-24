/* 8. String to Integer (atoi)
 * Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer (similar to C/C++'s atoi function).
 * Ekta Agrawal
 */

class Solution {
    public int myAtoi(String s) {
        
        //remove any leading and trailing whitespaces, if any.
        s = s.strip();

        //check whether string is empty or not.
        if(s.isEmpty()){
            return 0;
        }

        //store the sign of the number
        final int sign = s.charAt(0) == '-' ? -1 : 1;

        if (s.charAt(0) == '+' || s.charAt(0) == '-') {
            s = s.substring(1);
        }

        long num = 0;

        for (final char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                break;
            }
            num = num*10+(c-'0');
            if(sign * num <= Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }

            if(sign * num >= Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
        }
        return sign * (int)num;
    }
}
