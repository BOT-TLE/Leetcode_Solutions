class Solution {
    public int removeDuplicates(int[] nums) {
        int val = 0;
        for(int i = 1 ; i < nums.length ; i++)
        {
            if(nums[i-1] != nums[i])
            {
                val++;
                nums[val-1] = nums[i-1];
            }
        }
        nums[val] = nums[nums.length - 1];
        return ++val;
    }
}
