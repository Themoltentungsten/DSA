import java.util.Arrays;
class Solution {
    public int[] sortedSquares(int[] arr) {
        int size=arr.length;
        int f=0;
        // int t=0;
        while(f<size){
            arr[f]=(arr[f]*arr[f]);
            f++;
            // t++;
        }
        Arrays.sort(arr);
        return arr;
    }
}