class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int n = tokens.length;
        Arrays.sort(tokens);
        int max = 0, start = 0, end = n - 1, score = 0;

        while (start <= end) {
            if (power >= tokens[start]) {
                power -= tokens[start++];
                max = Math.max(max, ++score);
            } else if (score > 0) {
                power += tokens[end--];
                score--;
            } else
                break;
        }

        return max;
    }
}
