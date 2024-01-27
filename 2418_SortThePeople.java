/* 2418. Sort the People
 * You are given an array of strings names, and an array heights that consists of distinct positive integers. Both arrays are of length n. For each index i, names[i] and heights[i] denote the name and height of the ith person. Return names sorted in descending order by the people's heights.
 * Ekta Agrawal
 */

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        for (int i=0; i<heights.length; i++) {
            for (int j=0; j<heights.length-1-i; j++) {
                if (heights[j] < heights[j+1]) {
                    int temp = heights[j];
                    heights[j] = heights[j+1];
                    heights[j+1] = temp;

                    String temp1 = names[j];
                    names[j] = names[j+1];
                    names[j+1] = temp1;
                }
            }
        }
        return names;
    }
}
