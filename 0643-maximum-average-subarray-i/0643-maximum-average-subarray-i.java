class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int start = 0, end = 0;
        double ans = Double. NEGATIVE_INFINITY, sum = 0;
        while(end < nums.length)
        {
            sum += nums[end];
            if(end - start + 1 == k)
            {
                ans = Math.max(ans,sum/k);
                sum -= nums[start];
                start++;
            }
            end++;
        }
        return ans;
    }
}