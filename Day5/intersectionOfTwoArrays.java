/*
 * Given two integer arrays nums1 and nums2, return an array of their intersection. 
 * Each element in the result must be unique and you may return the result in any order.
 */
import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> intersectionList = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    if (!intersectionList.contains(nums1[i])) {
                        intersectionList.add(nums1[i]);
                    }
                    break;
                }
            }
        }

        int[] result = new int[intersectionList.size()];
        for (int i = 0; i < intersectionList.size(); i++) {
            result[i] = intersectionList.get(i);
        }

        return result;
    }
    public static void main(String args[]){
        Solution solution = new Solution();
        int firstarr[] = {1,2,2,1};
        int firstarr2[] = {2,2};
        int secondarr1[] = {4,9,5};
        int secondarr2[] = {9,4,9,8,4};
        System.out.println("The intersection of first and second array is : "+ solution.intersection(firstarr,firstarr2));
        System.out.println("The intersection of third and fourth array is : "+ solution.intersection(secondarr1,secondarr2));
    }
}