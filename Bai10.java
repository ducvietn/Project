import java.util.Scanner;

public class Solution {
    public int sumOfDigits(int n) {

        int sum = 0;

        if (n < 0) {
            n = -n;
        }

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Sum of " + n + " = " + sol.sumOfDigits(n));

    }
}