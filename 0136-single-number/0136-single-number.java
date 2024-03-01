class Solution {
    public int singleNumber(int[] nums) {
        int dupli = 0;
        for(int i = 0 ; i < nums.length ; i++)
        {   
            dupli ^= nums[i];
        }
        return dupli;
    }
}