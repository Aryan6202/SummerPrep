class Solution {
    long mod = 1000000007;

    public int countGoodNumbers(long n) {
        return (int)((pow(5, (n + 1) / 2) * pow(4, n / 2)) % mod);
    }

    private long pow(long a, long b) {
        long ans = 1;
        while (b > 0) {
            if (b % 2 == 1)
                ans = (ans * a) % mod;
            a = (a * a) % mod;
            b /= 2;
        }
        return ans;
    }
}