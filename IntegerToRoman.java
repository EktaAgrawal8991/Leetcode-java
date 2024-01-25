/* 12. Integer to Roman
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * Ekta Agrawal
 */

class Solution {
    public String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanSymbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder romanNumeral = new StringBuilder();

        for (int i=0; i<values.length; i++) {
            while (num >= values[i]) {
                num = num - values[i];
                romanNumeral.append(romanSymbols[i]);
            }
        }
        return romanNumeral.toString();
    }
}
