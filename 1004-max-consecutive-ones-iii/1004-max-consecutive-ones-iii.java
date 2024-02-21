class Solution {
    public int longestOnes(int[] nums, int k) {
        int zeroCount = 0;
        int start = 0, end = 0;
        int ans = 0;
        while(end < nums.length)
        {
            if(nums[end] == 0)
                zeroCount++;
            while(zeroCount > k)
            {
                if(nums[start] == 0)
                    zeroCount--;
                start++;
            }
            ans = Math.max(ans,end-start+1);
            end++;
        }
        return ans;
    }
}