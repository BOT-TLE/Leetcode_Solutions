class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int val = 0;
        int duplicate = -1;
        for(int i = 1 ; i < nums.size(); i++)
        {
            if(nums[i-1] != nums[i])
            {
                val++;
                nums[val - 1] = nums[i-1];
            }
        }
        nums[val] = nums[nums.size() -1];
        return ++val;
    }
};
