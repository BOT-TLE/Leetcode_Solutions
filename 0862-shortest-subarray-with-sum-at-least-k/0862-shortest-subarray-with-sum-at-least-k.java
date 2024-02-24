class Solution {
    public int shortestSubarray(int[] nums, int k) {
        
        int ans = Integer.MAX_VALUE;
        long prefixSum[] = new long[nums.length + 1]; 

        for (int i = 0; i < nums.length; i++) // Here we have calucalted the prefix sum 
            prefixSum[i + 1] = prefixSum[i] + nums[i];

        Deque<Integer> dq = new ArrayDeque<>(); // Decalred the deque 
        
        for (int i = 0; i <= nums.length ; i++) {
            
            while (!dq.isEmpty() && prefixSum[i] - prefixSum[dq.peek()] >= k) // if element cause the sum increase 
                ans = Math.min(ans, i - dq.poll());

            while (!dq.isEmpty() && prefixSum[i] <= prefixSum[dq.peekLast()]) // if element cause the dip in the sum 
                dq.pollLast();

            dq.add(i);
        }
        return ans <= nums.length ? ans : -1;
    }
}