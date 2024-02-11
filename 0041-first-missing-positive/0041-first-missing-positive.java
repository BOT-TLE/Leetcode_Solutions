class Solution {
    public int firstMissingPositive(int[] nums) {
        boolean contains_one = false; // we are considering the fact that 1 is not present in the given array
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i] == 1)
            {
                contains_one = true;
                break;
            }
        }
        
         // if one is not there we will return 1
        if(!contains_one)
            return 1;
        
        // if the size of array is one
        if(nums.length == 1)
            return 2;
        
        // now if one is there
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i] <= 0 || nums[i] > nums.length)
                nums[i] = 1;
        }
        
        // now all the values which are less than 1 and greater than size of array is replaced with one 
        // now we will set the index of value present by -ve sign with the value present 
        
        for(int i = 0 ; i < nums.length ; i++)
        {
            int index = Math.abs(nums[i]);
            if(nums[index -1] > 0)
                nums[index-1] *= -1; // mark it as present
        }
        
        // now the positive value present the index + 1 value is not there
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i] > 0)
                return i + 1;
        }
        
        // if all the values are negative then return size + 1 value
        return nums.length + 1;
    }
}