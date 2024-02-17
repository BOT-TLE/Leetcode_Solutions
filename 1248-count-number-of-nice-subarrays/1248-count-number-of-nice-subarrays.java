class Solution {
    public int ExactlyKWindow(int [] nums, int k)
    {
        int oddCount = 0;
        int ans = 0;
        int start = 0, end = 0;
        while(end < nums.length)
        {
            if((nums[end]&1)== 1)
                oddCount++;
            if(oddCount <= k)
                ans += end - start + 1;
            while(start <= end && oddCount > k)
            {
                if((nums[start] & 1) == 1)
                    oddCount--;
                start++;
                if(oddCount <= k)
                    ans += end - start + 1;
            }
            end++;
        }
        return ans;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return ExactlyKWindow(nums,k) - ExactlyKWindow(nums,k-1);
    }
}