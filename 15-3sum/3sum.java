class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length-2;i++) {
            if(i>0 && arr[i]==arr[i-1]) continue;
            int l=i+1;
            int r=arr.length-1;
            while(l<r) {
                int total=arr[i]+arr[l]+arr[r];
                if(total==0) {
                    ans.add(Arrays.asList(arr[i],arr[l],arr[r]));
                    l++;
                    r--;
                    while(l<r && arr[l]==arr[l-1]) l++;
                    while(l<r && arr[r]==arr[r+1]) r--;
                }
                else if(total<0) {
                    l++;
                }
                else {
                    r--;
                }
            }
        }
        return ans;
    }
}