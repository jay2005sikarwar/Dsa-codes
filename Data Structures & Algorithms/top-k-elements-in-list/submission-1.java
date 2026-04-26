class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>h=new HashMap<>();
        for(int num:nums){
            h.put(num,h.getOrDefault(num,0)+1);
        }
        
        List<Integer> list = new ArrayList<>(h.keySet());
        Collections.sort(list, (a, b) -> h.get(b) - h.get(a));

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = list.get(i);
        }
        return res;

    }
}
