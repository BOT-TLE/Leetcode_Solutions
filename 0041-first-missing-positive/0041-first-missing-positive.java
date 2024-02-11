// Case 1 : Using sorting to solve the question 
// Complexity = O(nlogn)
// The given code is self explanatory 

class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int mini = 1;
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i] == mini)
                mini++;
        }
        return mini;
        
    }
}
// Case 2 : Using an extra space to solve it 
// Complexity : O(n) but space complexity O(n)

// Here we will markup the index which is available 
// The elements which are out of bond i.e. Greater than size of array and elements which are below 1 are ignored as they will never contribute
class Solution {
    public int firstMissingPositive(int[] nums) {
        int arrayans[] = new int[nums.length];
        Arrays.fill(arrayans, 0); // Set the given array to zero 
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i] <= nums.length && nums[i] > 0) //elements within boundary 
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

// Case 3 : Doing it without extra space
// Complexity: O(n) and space O(1) 


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

        // We are here because we got the 1 in the given array 

    
        // if the size of array is one
        if(nums.length == 1)
            return 2;
        
        // now if one is there, we will check that if any element is out of bond , if we find so we will mark it as one 
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i] <= 0 || nums[i] > nums.length)
                nums[i] = 1;
        }
        
        // now all the values which are less than 1 and greater than size of array is replaced with 1
        // now we will set the index of value present by -ve sign with the value present in the given array - To understand it ping me or dry run it

        // for eg - If you have array after marking the element out of bond be arr[] = [3,2,1,1,1]
        // now as we will mark we will have arr[] = [-3,-2,-1,1,1] 
        // if it is already marked we will not mark it again so that's we will look for nums[index -1] be positive. 
        
        for(int i = 0 ; i < nums.length ; i++)
        {
            int index = Math.abs(nums[i]); 
            if(nums[index -1] > 0)
                nums[index-1] *= -1; // mark it as present
        }
        
        // now the positive value represent that the index + 1 value is not there
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i] > 0)
                return i + 1;
        }
        
        // if all the values are negative then return size + 1 value
        return nums.length + 1;
    }
}
