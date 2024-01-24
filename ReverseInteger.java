/* 7. Reverse Integer
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0. Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 * Ekta Agrawal
 */

class Solution {
    public int reverse(int x) {

        //check if the number is negative
        boolean isNegative = x<0;

        //convert the number to positive
        long num = Math.abs((long)x);

        //reverse the digit
        long revNum = 0;
        while (num !=0) {
            revNum = revNum*10 + num%10;
            num = num/10;
        }

        //handle negative case
        if (isNegative) {
            revNum = -revNum;
        }

        return (revNum < Integer.MIN_VALUE || revNum > Integer.MAX_VALUE)?0:(int)revNum;
    }
}

/*
The solution uses a long data type to store the reversed number during the calculation to handle the case when the reversed number is outside the range of the signed 32-bit integer. After calculating the reversed number, it checks whether it falls within the signed 32-bit integer range. If it does, it casts it to an int and returns it. Otherwise, it returns 0.
*/
