/* 912. Sort an Array
 * Given an array of integers nums, sort the array in ascending order and return it. You must solve the problem without using any built-in functions in O(nlog(n)) time complexity and with the smallest space complexity possible.
 * Ekta Agrawal
 */

class Solution {
    public static void mergeSort (int[] nums, int beg, int mid, int end) {
        int n1 = mid-beg+1;
        int n2 = end-mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i=0; i<n1; i++) {
            leftArray[i] = nums[beg+i];
        }

        for (int j=0; j<n2; j++) {
            rightArray[j] = nums[mid+1+j];
        }

        int i=0;
        int j=0;
        int k=beg;

        while (i<n1 && j<n2) {
            if (leftArray[i] < rightArray[j]) {
                nums[k++] = leftArray[i++];
            } else {
                nums[k++] = rightArray[j++];
            }
        }

        while (i<n1) {
            nums[k++] = leftArray[i++];
        }

        while(j<n2) {
            nums[k++] = rightArray[j++];
        }
    }

    public static void merge (int[] nums, int beg, int end) {
        if (beg < end) {
            int mid = (beg+end)/2;
            merge (nums, beg, mid);
            merge (nums, mid+1, end);
            mergeSort(nums, beg, mid, end);
        }
    }

    public int[] sortArray(int[] nums) {
        merge(nums, 0, nums.length-1);
        return nums;
    }
}
