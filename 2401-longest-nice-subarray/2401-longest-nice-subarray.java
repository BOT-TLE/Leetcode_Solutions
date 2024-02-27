class Solution {
    public int longestNiceSubarray(int[] nums) {
       int a = 0;
        int bits = 0; // it will store the updated bit that has to be '&' with current number
        int f = 0;    // it will store the start point from where 0 occured as '&'
        for( int i = 0; i < nums.length; i++){
            while( (bits & nums[i]) > 0){      // until their '&' doesn't becomes 0 , update the bit and increment the start pointer
                bits ^= nums[f++];
            }
            bits |= nums[i];            // update , as all combined essence has to be '&' and check if 0 comes
            a = Math.max(a, i - f + 1);
        }
        return a;
    }
}