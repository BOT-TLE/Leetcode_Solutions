class Solution {
    public int longestSubarray(int[] nums) {
        int zerocount = 0;
        int i = 0, j = 0;
        int ans = 0;
        while(j < nums.length)
        {
            if(nums[j] == 0)
            {
                zerocount++;
                while(zerocount > 1)
                {
                    if(nums[i++] == 0)
                        zerocount--;
                }
            }
            ans = Math.max(ans,j-i+1);
            j++;
        }
        return ans-1;
    }
}