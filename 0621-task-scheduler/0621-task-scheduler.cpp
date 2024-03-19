class Solution {
public:
    int leastInterval(vector<char>& tasks, int n) {
        unordered_map<char, int> mpp;
        for (char it : tasks) {
            mpp[it]++;
        }
        int maxi = 0;
        for (auto& it : mpp) {
            maxi = max(maxi, it.second);
        }
        int maxi2 = 0;
        for (auto& it : mpp) {
            if (it.second == maxi) {
                maxi2++;
            }
        }
         int ans = (maxi - 1) * (n + 1) + maxi2;
        return max(ans, (int)tasks.size());
    }
};