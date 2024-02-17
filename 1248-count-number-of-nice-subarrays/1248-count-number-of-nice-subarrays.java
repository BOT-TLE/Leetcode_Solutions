class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int oddCount = 0;
        int start = 0, end =0 , ans = 0;
        int count = 0;
        boolean oneTime = false;
        while(end < nums.length)
        {
            if((nums[end]&1) == 1)
            {
                oddCount++;
                count = 0;
            }
            while(oddCount == k)
            {
                count++;
                   if((nums[start]&1)==1)
                    oddCount--;
                start++;
                   oneTime = true;
            }
            ans += count;
            end++;
        }
        return ans;
    }
}