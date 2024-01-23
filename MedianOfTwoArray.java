/* 1. Median of Two Sorted Arrays
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 * Ekta Agrawal
 */

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length + nums2.length];
        int i=0, j=0, k=0;

        while (i<nums1.length && j<nums2.length) {
            if (nums1[i] < nums2[j]) {
                result[k++] = nums1[i++];
            } else {
                result[k++] = nums2[j++];
            }
        }

        while (i<nums1.length) {
            result[k++] = nums1[i++];
        }

        while (j<nums2.length) {
            result[k++] = nums2[j++];
        }

        int pos = (nums1.length + nums2.length)/2;
        double num;

        if ((nums1.length+nums2.length)%2 == 0 && (nums1.length+nums2.length)>0) {
            num = (result[pos-1]+result[pos])/2.0;
        }else if ((nums1.length+nums2.length)%2 != 0) {
            num = result[pos];
        }else {
            num = result[0];
        }
        return num;
    }
}
