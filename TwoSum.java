/* 1. Two Sum
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * Ekta Agrawal
 */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            int sum = target - nums[i];
            if (hashMap.containsKey(sum)) {
                return new int[]{hashMap.get(sum), i};
            } else {
                hashMap.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
