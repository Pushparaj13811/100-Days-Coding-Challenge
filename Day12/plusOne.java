class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1; 
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            digits[i] = sum % 10;
            carry = sum / 10;
        }
        if (carry > 0) {
            int[] result = new int[n + 1];
            result[0] = carry;
            System.arraycopy(digits, 0, result, 1, n);
            return result;
        } else {
            return digits;
        }
    }
}