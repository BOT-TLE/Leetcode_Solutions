class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int start1 = 0;
        int start2 = 0;
        while(start1 < nums1.length && start2 < nums2.length)
        {
            if(nums1[start1] == nums2[start2])
            {
                return nums1[start1];
            }
            else if(nums1[start1] < nums2[start2])
            {
                start1 += 1;
            }
            else
            {
                start2 += 1;
            }
        }
        return -1;
    }
}