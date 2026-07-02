class Solution {
    int countTriplets(int target, int arr[]) {
        Arrays.sort(arr);
        int n=arr.length;
        int sum=0;
        int count=0;
        for(int i=0;i<n-2;i++){
            int l=i+1;
            int r=n-1;
            while(l<r){
                sum=arr[i]+arr[l]+arr[r];
                if(sum<target){
                count += (r-l);
                l++;
                }else{
                r--;
                }
            }
        }
        return count;
    }
}