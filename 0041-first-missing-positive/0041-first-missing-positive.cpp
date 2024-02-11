class Solution {
public:
    int firstMissingPositive(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        int mini = 1;
        for(auto it : nums)
        {
            if(it == mini)
                mini++;
        }
        return mini;
    }
};