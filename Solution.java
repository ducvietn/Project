import java.util.Scanner;

public class Solution {
    public long fibonacci(long n) {
        if (n < 0) return -1;
        if (n == 0) return 0;
        if (n == 1) return 1;
        long prev2 = 0;
        long prev1 = 1;
        long current = 0;
        for (long i = 2; i <= n; i++) {
            if (Long.MAX_VALUE - prev1 < prev2) {
                return Long.MAX_VALUE;
            }
            current = prev2 + prev1;
            prev2 = prev1;
            prev1 = current;
        }
        return  current;
    }
    public static void main (String[] args) {
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.print(sol.fibonacci(n));

    }
}