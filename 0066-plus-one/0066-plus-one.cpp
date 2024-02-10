class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
        int val = digits[digits.size() - 1];
        if(val < 9)
        {
            digits[digits.size() - 1]++;
            return digits;
        }
        else{
            vector<int> ans;
            bool gotIt = false;
            for(int i = digits.size() - 1 ; i >= 0 ; --i)
            {
                if(digits[i] == 9 and !gotIt)
                {
                    ans.emplace_back(0);
                }
                if(digits[i] != 9 and !gotIt)
                {
                    digits[i]++;
                    gotIt = true;
                }
                if(gotIt)
                    ans.emplace_back(digits[i]);
            }
            if(ans[ans.size() - 1] == 0)
                ans.emplace_back(1);
            reverse(ans.begin(),ans.end());
            return ans;
        }
    }
};