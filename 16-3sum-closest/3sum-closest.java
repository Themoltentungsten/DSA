class Solution {
    public int threeSumClosest(int[] arr, int target) {
        Arrays.sort(arr);
        int n = arr.length;
        int ans=0;
        int sum=0;
        int diff1=10000000;
        for(int i=0;i<n-2;i++){
            if(i>0&&arr[i]==arr[i-1]) i++;
            int l=i+1;
            int r=n-1;
            while(l<r){
            sum=arr[i]+arr[l]+arr[r];
            if(sum==target)
            return sum;
            else if(sum<target)
            l++;
            else
            r--;
            int diff=Math.abs(sum-target);
            if(diff<diff1){
                diff1=diff;
                ans=sum;
            }
            }
        }
        return ans;
    }
}