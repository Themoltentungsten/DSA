import java.util.*;

class Solution {
    public int reverse(int x) {
        // int max = (int) Math.pow(2, 31) - 1;
        // int min = -(int) Math.pow(2, 31);
        int rev = 0;
        int temp = 0;
        while (x != 0) {
            temp = x % 10;
            if (rev > Integer.MAX_VALUE / 10 ||
                    rev < Integer.MIN_VALUE / 10) {
                return 0;
            }
            rev = rev * 10 + temp;
            x = x / 10;
        }
        return rev;
    }
}