/* 75. Sort Colors
 * Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue. We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively. You must solve this problem without using the library's sort function.
 * Ekta Agrawal
 */

class Solution {
    public void sortColors(int[] nums) {
        int zeroCount = 0;
        int oneCount = 0;
        int twoCount = 0;

        for (int i=0; i<nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            } else if (nums[i] == 1) {
                oneCount++;
            } else {
                twoCount++;
            }
        }

        for (int i=0; i<zeroCount; i++) {
            nums[i] = 0;
        }

        for (int i=zeroCount; i<zeroCount+oneCount; i++) {
            nums[i] = 1;
        }

        for (int i=zeroCount+oneCount; i<zeroCount+oneCount+twoCount; i++) {
            nums[i] = 2;
        }
    }
}
