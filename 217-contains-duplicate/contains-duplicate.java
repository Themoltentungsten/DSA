class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> yash = new HashSet<>();
        for(int num:nums){
            if(yash.contains(num)){
                return true;
            }
            yash.add(num);
        }
        return false;
    }
}