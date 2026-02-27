class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0;
        int n = 0;
        int og=x;
        if (x >= 0 && x <= Integer.MAX_VALUE) {
            while (x != 0) {
                n = x % 10;
                rev = rev * 10 + n;
                x = x / 10;
            }
        }
        return rev == og;
    }
}
