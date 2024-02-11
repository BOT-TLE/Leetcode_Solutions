class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int mini = 1;
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i] == mini)
                mini++;
        }
        return mini;
        
    }
}