class Solution {
    public int maxFrequencyElements(int[] nums){
        Map<Integer,Integer> mp = new HashMap<>();
        int maxi = 1;
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(!mp.containsKey(nums[i]))
                mp.put(nums[i],1);
            else{
                int freq = mp.get(nums[i]);
                mp.put(nums[i],freq+1);
                maxi = Math.max(maxi,freq+1);
            }
        }
        
        int countElements = 0;
        for(Integer i : mp.values())
            if(i == maxi)
                countElements++;
        
        return countElements*maxi;
    }
}