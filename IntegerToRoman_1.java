/* 12. Integer to Roman
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * Ekta Agrawal
 */

class Solution {
    public String intToRoman(int num) {
        String[] once = {"" , "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] thousands = {"", "M", "MM", "MMM"};
        
        return thousands[num/1000] + hundreds[(num%1000)/100] + tens[(num%100)/10] + once[num%10];
    }
}
