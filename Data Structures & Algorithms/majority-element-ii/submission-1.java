class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer>h=new HashMap<>();
        for(int num:nums){
            h.put(num,h.getOrDefault(num,0)+1);
        }
        ArrayList<Integer>l=new ArrayList<>();
        int n=nums.length;
        for(int i:h.keySet()){
            if(h.get(i)>n/3){
                l.add(i);
            }
        }
        return l;
        
    }
}