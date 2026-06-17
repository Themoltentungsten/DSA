class Solution {
    public int[] twoSum(int[] arr, int target) {
        int size = arr.length;
        int la = 0;
        int ra = size-1;
        while(la<ra){
            if(arr[la]+arr[ra]==target){
                return new int[] {la+1,ra+1};
            }
            else if(arr[la]+arr[ra]<target){
                la++;
            }else{
                ra--;
            }
        }
        return new int[] {-1,-1};
    }
}