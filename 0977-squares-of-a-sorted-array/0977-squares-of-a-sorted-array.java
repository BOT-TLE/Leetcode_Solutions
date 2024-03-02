class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int index = nums.length - 1 , low = 0, high = nums.length - 1;
        while(low <= high)
        {
            if(Math.abs(nums[low]) > Math.abs(nums[high]))
            {
                ans[index--] = nums[low]*nums[low];
                low++;
            }
            else{
                ans[index--] = nums[high]*nums[high];
                high--;
            }
        }
        return ans;
    }
}