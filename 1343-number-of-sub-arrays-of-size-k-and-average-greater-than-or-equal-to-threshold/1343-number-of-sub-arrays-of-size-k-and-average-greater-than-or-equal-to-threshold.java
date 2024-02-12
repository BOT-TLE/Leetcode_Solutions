class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int i = 0;
        int j = 0;
        int sum = 0;
        int count = 0;
        while(j < arr.length)
        {
            if(j - i + 1 < k)
                sum += arr[j++];
            else
            {   
                sum += arr[j++];
                if((sum/k) >= threshold)
                    count++;
                sum -= arr[i++];
            }
        }
        return count;
    }
}