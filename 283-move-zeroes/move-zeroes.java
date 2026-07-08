class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int t = 0;
        int f = 0;
        int count = 0;
        while(t<n){
            if(nums[t]==0){
                count++;
                t++;
            }else{
                nums[f++]=nums[t++];
            }
        }
        while(count-->0){
            nums[f++]=0;
        }
    }
}