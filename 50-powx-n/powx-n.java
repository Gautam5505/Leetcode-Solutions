class Solution {
    public double myPow(double x, int n) {
        long num = n;  // Convert to long to handle Integer.MIN_VALUE
        if (num < 0) {
            x = 1 / x;
            num = -num;
        }
        double result = 1.0;
        while (num > 0) {
            if (num % 2 == 1) {
                result *= x;
            }
            x *= x;
            num /= 2;
        }
        return result;
    }
}
