class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer>h=new HashSet<>();
        for(int n:nums){
            h.add(n);
        }
        for(int i=1;;i++){
            if(!h.contains(i)){
                return i;
            }
        }
        
    }
}