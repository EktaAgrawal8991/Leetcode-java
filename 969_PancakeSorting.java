/* 969. Pancake Sorting
 * Given an array of integers arr, sort the array by performing a series of pancake flips. In one pancake flip we do the following steps:
 * Choose an integer k where 1 <= k <= arr.length. Reverse the sub-array arr[0...k-1] (0-indexed).
 * Ekta Agrawal
 */

class Solution {
    private void flip (int[] arr, int k) {
        int start = 0;
        int end = k;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    private int findMaxIndex (int[] arr, int end) {
        int maxEle = arr[0];
        int maxIndex = 0;

        for (int i=1; i<end; i++) {
            if (arr[i] > maxEle) {
                maxEle = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> flips = new ArrayList<>();

        for (int i=arr.length; i>0; i--) {
            int maxIndex = findMaxIndex(arr, i);
            flip(arr, maxIndex);
            flip(arr, i-1);

            flips.add(maxIndex+1);
            flips.add(i);
        }
        return flips;
    }
}
