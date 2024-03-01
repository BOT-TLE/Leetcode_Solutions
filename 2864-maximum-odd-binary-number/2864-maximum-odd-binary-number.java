class Solution {
    public String maximumOddBinaryNumber(String s) {
        int countOne = 0;
        for(int i = 0 ; i < s.length() ; i++)
        {
            if(s.charAt(i) == '1')
                countOne++;
        }
        countOne--;
        String ans = "";
        for(int i = 0 ; i < s.length() - 1 ; i++)
        {
            if(countOne == 0)
                ans += '0';
            else
            {
                ans += '1';
                countOne--;
            }
        }
        ans += '1';
        return ans;
    }
}