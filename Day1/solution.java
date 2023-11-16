/*
 * Question :
 * Given a sorted array of distinct integers and a target value, return the index if the target is found. 
 * If not, return the index where it would be if it were inserted in order.
 * Leetcode problem link :- https://leetcode.com/problems/search-insert-position/description/
 */
class Solution {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = { 1, 3, 5, 6 };
        int target1 = 5;
        System.out.println(solution.searchInsert(nums1, target1));

        int[] nums2 = { 1, 3, 5, 6 };
        int target2 = 2;
        System.out.println(solution.searchInsert(nums2, target2));

        int[] nums3 = { 1, 3, 5, 6 };
        int target3 = 7;
        System.out.println(solution.searchInsert(nums3, target3));
    }
}