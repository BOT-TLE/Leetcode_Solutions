class Solution {
    public int atMostKWindow(int nums[], int k)
    {
        Map<Integer, Integer> mp = new HashMap<>();
        int start = 0, end = 0;
        int ans = 0;
        while(end < nums.length)
        {
            if(!mp.containsKey(nums[end]))
                mp.put(nums[end],1);
            else{
                int freq=mp.get(nums[end]);
                mp.put(nums[end],freq+1);
            }
            if(mp.size() <= k)
                ans += end - start + 1;
            while(start <= end && mp.size() > k)
            {
                int leftValue = nums[start];
                int valCount = mp.get(leftValue);
                mp.put(leftValue,valCount - 1);

                if(mp.get(leftValue)==0) 
                    mp.remove(leftValue);
                start++;
                
                if(mp.size() <= k)
                    ans += end - start + 1;
            }
            end++;
        }
        return ans;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMostKWindow(nums,k) - atMostKWindow(nums,k-1);
    }
}