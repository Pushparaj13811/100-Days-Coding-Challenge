/*
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, 
 * and j != k, and nums[i] + nums[j] + nums[k] == 0.Notice that the solution set must not contain duplicate triplets.
 */

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int target = 0;
        Arrays.sort(nums);
        List<List<Integer>> output = new ArrayList<>();
        
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int j = i + 1;
                int k = nums.length - 1;
                while (j < k) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (sum == target) {
                        output.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        while (j < k && nums[j] == nums[j + 1]) j++;
                        while (j < k && nums[k] == nums[k - 1]) k--;
                        j++;
                        k--;
                    } else if (sum < target) {
                        j++;
                    } else {
                        k--;
                    }
                }
            }
        }
        
        return output;
    }
}