class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>h=new HashMap<>();
        for(int num:nums){
            h.put(num,h.getOrDefault(num,0)+1);
        }
        int d=0;
        int n=nums.length;
        for(int i:h.keySet()){
            if(h.get(i)>n/2){
                d=i;
            }
        }
        return d;
        
    }
}