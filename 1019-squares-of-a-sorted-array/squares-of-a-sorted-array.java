class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int l = 0;
        int r = n - 1;
        int bt = n - 1;
        int[] res = new int[n];
        while (l <= r) {
            int lsq = nums[l] * nums[l];
            int rsq = nums[r] * nums[r];
            if(lsq>rsq){
                res[bt] = lsq;
                l++;
            }else{
                res[bt] = rsq;
                r--;
            }
            bt--;
        }
        return res;
    }
}