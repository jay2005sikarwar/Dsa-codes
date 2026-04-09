class Solution {
    public boolean hasDuplicate(int[] nums) {
        // int n=nums.length;
        // Arrays.sort(nums);
        // for(int i=1;i<n;i++){
        //     if(nums[i]==nums[i-1]){
        //         return true;
        //     }
        // }
        // return false;
        HashMap<Integer,Integer>h=new HashMap<>();
        for(int num:nums){
            h.put(num,h.getOrDefault(num,0)+1);
        }
        for(int i:h.keySet()){
            if(h.get(i)>1){
                return true;
            }
        }
        return false;
    }
}