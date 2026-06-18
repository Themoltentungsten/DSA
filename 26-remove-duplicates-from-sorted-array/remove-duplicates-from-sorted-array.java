class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int t = 1;
        int f = 0;
        while(t<n){
            if(nums[f]==nums[t]){
                t++;
            }else{
                f++;
                nums[f]=nums[t];
                t++;
            }
        }
        return f+1;
    }
}