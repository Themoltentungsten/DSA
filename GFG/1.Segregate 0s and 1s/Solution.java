class Solution {
    void segregate0and1(int[] arr) {
        int count = 0;
        int size = arr.length;
        for(int i=0;i<=size-1;i++){
            if(arr[i]==0)
            count++;
        }
        for(int i=0;i<count;i++){
            arr[i]=0;
        }
        for(int i=count;i<=size-1;i++){
            arr[i]=1;
        }
    }
}