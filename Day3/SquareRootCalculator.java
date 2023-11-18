/*
 * Given a non-negative integer x, return the square root of x rounded down to the nearest integer. 
 * The returned integer should be non-negative as well.You must not use any built-in exponent function or operator.
 * For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 */
class SquareRootCalculator {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        long start = 1;
        long end = x;
        long result = 0;

        while (start <= end) {
            long mid = (start + end) / 2;
            long square = mid * mid;

            if (square == x) {
                return (int) mid;
            } else if (square < x) {
                start = mid + 1;
                result = mid;
            } else {
                end = mid - 1;
            }
        }

        return (int) result;
    }

    public static void main(String args[]) {
        SquareRootCalculator solution = new SquareRootCalculator();
        System.out.println("The square root of 4 is " + solution.mySqrt(4));
        System.out.println("The square root of 8 is " + solution.mySqrt(8));
    }
}
