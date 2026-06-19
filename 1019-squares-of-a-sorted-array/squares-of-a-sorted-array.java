import java.util.Arrays;
class Solution {
    public int[] sortedSquares(int[] arr) {
        int size=arr.length;
        int f=0;
        int t=0;
        while(t<size){
            arr[f]=(arr[t]*arr[t]);
            f++;
            t++;
        }
        Arrays.sort(arr);
        return arr;
    }
}