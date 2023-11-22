/*
 * Given an array A of size N of integers. Your task is to find the sum of minimum and maximum element in the array.
 */
public class sumOfMinAndMaxInArray {
    public static int findSum(int A[], int N) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            if (min > A[i]) {
                min = A[i];
            }
            if (max < A[i]) {
                max = A[i];
            }
        }
        return max + min;
    }
}
