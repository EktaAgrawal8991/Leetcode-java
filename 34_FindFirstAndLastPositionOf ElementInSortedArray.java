/* 34. Find First and Last Position of Element in Sorted Array
 * Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value. If target is not found in the array, return [-1, -1]. You must write an algorithm with O(log n) runtime complexity.
 * Ekta Agrawal
 */

class Solution {

    private int findFirstOccurence (int[] nums, int target) {
        int index = -1;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == target) {
                index = i;
                break;
            }
        }
        return index;
    }

    private int findLastOccurence (int[] nums, int target) {
        int index = -1;
        for (int i=nums.length-1; i>=0; i--) {
            if (nums[i] == target) {
                index = i;
                break;
            }
        }
        return index;
    }

    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];

        result[0] = findFirstOccurence(nums, target);
        result[1] = findLastOccurence(nums, target);
        return result;
    }
}
