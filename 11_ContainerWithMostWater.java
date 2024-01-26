/* 11. Container With Most Water
 * You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
 * Find two lines that together with the x-axis form a container, such that the container contains the most water.
 * Return the maximum amount of water a container can store.
 * Ekta Agrawal
 */

class Solution {
    public int minimum (int m, int n) {
        return (m<n) ? m : n;
    }

    public int maximum (int m, int n ) {
        return (m>n) ? m : n;
    }

    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length-1;

        while (left<right) {
            int area = minimum(height[left], height[right]) * (right-left);
            maxArea = maximum(maxArea, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}

/*
To explain the code using a dry run, let's take an example.

Let's say we have an array of heights: height = [1, 8, 6, 2, 5, 4, 8, 3, 7].

Initially, we set maxArea = 0, left = 0, and right = height.length - 1 (which is 8).

Now we start a loop that continues until left is less than right.

First, we calculate the current area using the formula area = Math.min(height[left], height[right]) * (right - left). In this case, height[left] is 1, height[right] is 7, and the distance between them is 8 - 0 = 8. So, the current area is 1 * 8 = 8.

We update the maxArea to be the maximum value between maxArea and the current area, so maxArea = max(0, 8) = 8.

Since height[left] is less than height[right] (1 < 7), we increment left by 1. Now left = 1 and right = 8.

Next, we calculate the new area using the updated values of left and right. The minimum height between height[1] and height[8] is 8, and the distance between them is 8 - 1 = 7. So, the current area is 7 * 8 = 56.

We update the maxArea to be the maximum value between maxArea and the current area, so maxArea = max(8, 56) = 56.

Since height[left] is still less than height[right] (8 < 7), we increment left again. Now left = 2 and right = 8.

We calculate the new area using the updated values of left and right. The minimum height between height[2] and height[8] is 6, and the distance between them is 8 - 2 = 6. So, the current area is 6 * 6 = 36.

We update the maxArea to be the maximum value between maxArea and the current area, so maxArea = max(56, 36) = 56 (since 56 is bigger than 36).

We continue this process until left becomes equal to right. In each iteration, we calculate the current area, update maxArea if necessary, and move the left or right pointer accordingly.

Finally, when the loop ends, we return the maxArea, which in this case is 56.

So, the max area that can be formed by selecting two heights from the given array is 56.
*/
