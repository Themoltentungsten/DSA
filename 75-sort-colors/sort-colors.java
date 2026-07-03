class Solution {
    public void sortColors(int[] arr) {
        int n = arr.length;
        int c0=0;
        int c1=0;
        int c2=0;
        int filler=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                c0++;
            }else if(arr[i]==1){
                c1++;
            }else{
                c2++;
            }
        }
        while(c0-->0)
            arr[filler++]=0;
        while(c1-->0)
            arr[filler++]=1;
        while(c2-->0)
            arr[filler++]=2;
    }
}