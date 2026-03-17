class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        char[] ans =new char[n];
        for(int i=0;i<n;i++){
            ans[i] = s[n-i-1];
        }
        for(int i=0;i<n;i++){
            s[i]=ans[i];
        }
    }
}