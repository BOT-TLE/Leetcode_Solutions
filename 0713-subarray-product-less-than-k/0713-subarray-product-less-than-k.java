class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
       
        if(k == 0 || k == 1)
            return 0;
        
        int start = 0, end = 0;
        int ans = 0;
        int product = 1;
        
        while(end < nums.length)
        {   
            product *= nums[end];
            
            while(product >= k && start <= end)
            {
                product /= nums[start];
                start++;
            }
            
            ans+= end - start + 1;
            
            end++;
        }
        
        return ans;
    }
}