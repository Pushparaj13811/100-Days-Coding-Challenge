/*
 * Given n non-negative integers representing an elevation map where the width of each bar is 1, 
 * compute how much water it can trap after raining.
 */
class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int trappedwater = 0;
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        leftMax[0] = height[0];
        for(int i = 1; i < n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        for(int i = n-2; i >= 0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }
        for(int i = 0 ; i < n; i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedwater += waterLevel - height[i];
        }
        return trappedwater;
    }
    public static void main(String args[]){
        Solution solution = new Solution();
        int height1[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        int height2[] = {4,2,0,3,2,5};
        System.out.println("The total rainwater trapped is : "+solution.trap(height1)+" units");
        System.out.println("The total rainwater trapped is : "+solution.trap(height2)+" units");
    }
}