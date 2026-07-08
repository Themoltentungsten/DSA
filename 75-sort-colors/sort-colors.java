class Solution {
    public void sortColors(int[] arr) {
        int n = arr.length;
        int l = 0;
        int m = 0;
        int r = n-1;
        while(m<=r){
            if(arr[m]==0){
                int temp = 0;
                temp=arr[l];
                arr[l]=arr[m];
                arr[m]=temp;
                temp=0;
                l++;
                m++;
            }else if(arr[m]==2){
                int temp = 0;
                temp=arr[r];
                arr[r]=arr[m];
                arr[m]=temp;
                temp=0;
                r--;
            }else{
                m++;
            }
        }
    }
}