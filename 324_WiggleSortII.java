/* 324. Wiggle Sort II
 * Given an integer array nums, reorder it such that nums[0] < nums[1] > nums[2] < nums[3]....You may assume the input array always has a valid answer.
 * Ekta Agrawal
 */

class Solution {
    public void wiggleSort(int[] nums) {
        int n= nums.length-1;
        int[] newNums = Arrays.copyOf(nums, nums.length);

        Arrays.sort(newNums);

        for (int i=1; i<nums.length; i+=2) {
            nums[i] = newNums[n--];
        }

        for (int i=0; i<nums.length; i+=2) {
            nums[i] = newNums[n--];
        }
    }
}
