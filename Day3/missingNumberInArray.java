/*
 * Given an array nums containing n distinct numbers in the range [0, n], return the only number in 
 * the range that is missing from the array.
 */
public class missingNumberInArray {
    public int missingNumber(int[] nums) {
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            num ^= nums[i];
        }
        for (int i = 0; i <= nums.length; i++) {
            num ^= i;
        }
        return num;
    }

    public static void main(String args[]) {
        missingNumberInArray solution = new missingNumberInArray();
        int numbers1[] = { 3, 0, 1 };
        int numbers2[] = { 0, 1 };
        int numbers3[] = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        System.out.println("This missing number is : " + solution.missingNumber(numbers1));
        System.out.println("The missig number is : " + solution.missingNumber(numbers2));
        System.out.println("This missing number is : " + solution.missingNumber(numbers3));
    }

}
