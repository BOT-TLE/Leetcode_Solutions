class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int m = nums1.length, n = nums2.length;
        List<Integer> res = new ArrayList<>();
        int i = 0, j = 0;
        while(i < m && j < n) {
            if(nums1[i] == nums2[j]) {
                res.add(nums1[i]);
                while(i < m - 1 && nums1[i] == nums1[i + 1]) {
                    i++;
                }
                while(j < n - 1 && nums2[j] == nums2[j + 1]) {
                    j++;
                }
                i++;
                j++;
            } else if(nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}