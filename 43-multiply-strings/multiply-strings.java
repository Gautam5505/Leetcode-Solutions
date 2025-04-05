class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")) return "0";

        int n = num1.length(), m = num2.length();
        int[] result = new int[n + m];

        for(int i = n - 1; i >= 0; i--) {
            int digit1 = num1.charAt(i) - '0';
            for(int j = m - 1; j >= 0; j--) {
                int digit2 = num2.charAt(j) - '0';

                int product = digit1 * digit2;
                int sum = product + result[i + j + 1];

                result[i + j] += sum / 10;
                result[i + j + 1] = sum % 10;
            }
        }

        // Build the result string
        StringBuilder sb = new StringBuilder();
        for(int num : result) {
            // Skip leading zeros
            if(!(sb.length() == 0 && num == 0)) {
                sb.append(num);
            }
        }

        return sb.toString();
    }
}