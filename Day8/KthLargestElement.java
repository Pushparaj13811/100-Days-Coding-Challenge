/*
 * Given an integer array nums and an integer k, return the kth largest element in the array.
 * Note that it is the kth largest element in the sorted order, not the kth distinct element.
 */

import java.util.Arrays;

public class KthLargestElement {

  public int findKthLargest(int[] nums, int k) {
    int[] arr = new int[2 * 10000 + 1];
    for (int i : nums) arr[i + 10000]++;
    for (int i = arr.length - 1; i >= 0; i--) {
      k -= arr[i];
      if (k <= 0) return i - 10000;
    }
    return -1;
  }
}
