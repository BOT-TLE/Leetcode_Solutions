class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long minCount = 0, maxCount = 0;
        int start = 0, end = 0;
        long ans = 0, count = 0;
        while(end < nums.length)
        {
            if(nums[end] > maxK || nums[end] < minK)
            {
                start = end + 1;
                count = 0;
                minCount = 0;
                maxCount = 0;
            }
            if(nums[end] == minK)
                minCount++;
            if(nums[end] == maxK)
                maxCount++;

            while(minCount > 0 && maxCount > 0)
            {
                count++;
                if(nums[start] == minK)
                    minCount--;
                if(nums[start] == maxK)
                    maxCount--;
                start++;
                
            }
            ans += count;
            end++;
        }
        return ans;
    }
}