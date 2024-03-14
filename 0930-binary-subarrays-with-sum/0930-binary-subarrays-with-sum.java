class Solution {
    public int atmost(int[] nums, int goal){
        int i=0,j=0,sum=0,count = 0;
        int n = nums.length;
        while(j < n){
            sum += nums[j];
            while(sum > goal && i <= j){
                sum -= nums[i];
                i++;
            }
            count += j-i+1;
            j++;
        }
        return count;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atmost(nums,goal) - atmost(nums,goal-1);
    }
}