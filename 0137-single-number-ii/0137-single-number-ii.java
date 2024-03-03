class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(!mp.containsKey(nums[i]))
                mp.put(nums[i],1);
            else{
                int freq = mp.get(nums[i]);
                mp.put(nums[i],freq+1);
            }
        }
        for(Map.Entry<Integer,Integer> i : mp.entrySet())  
        {
            if(i.getValue() == 1)
                return i.getKey();
        }
        return 0;
    }
}