class Solution {
    public int firstMissingPositive(int[] nums) {
        int arrayans[] = new int[nums.length];
        Arrays.fill(arrayans, 0);
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i] <= nums.length && nums[i] > 0)
                arrayans[nums[i] - 1] = nums[i];
        }
        for(int i = 0 ; i < arrayans.length ; i++)
        {
            if(arrayans[i] == 0)
                return i+1;
        }
        return nums.length + 1;
    }
}