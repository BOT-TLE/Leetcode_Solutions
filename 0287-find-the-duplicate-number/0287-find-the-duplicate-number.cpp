class Solution {
public:
    // Method to find duplicate element in a vector
    int findDuplicate(std::vector<int>& nums) {
        std::sort(nums.begin(), nums.end()); // Sort the vector in ascending order
        for (int i = 0; i < nums.size() - 1; i++) { // Iterate through the sorted vector
            if (nums[i] == nums[i + 1]) // If adjacent elements are equal (i.e., a duplicate is found)
                return nums[i]; // Return the duplicate element
        }
        return -1; // If no duplicates found, return -1
    }
};