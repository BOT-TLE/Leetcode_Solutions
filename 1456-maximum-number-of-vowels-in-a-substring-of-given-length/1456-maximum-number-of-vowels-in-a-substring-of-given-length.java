class Solution {
    public int maxVowels(String s, int k) {
        int start = 0 , end = 0;
        int ans = 0;
        int Vowelcount =0;
        while(end < s.length())
        {
            if(s.charAt(end) == 'a' || 
              s.charAt(end) == 'e' ||
              s.charAt(end) == 'i' || 
              s.charAt(end) == 'o' ||
              s.charAt(end)  == 'u' )
                Vowelcount++;
            if(end - start + 1 == k)
            {
                ans = Math.max(ans,Vowelcount);
                    if(s.charAt(start) == 'a' || 
                      s.charAt(start) == 'e' ||
                      s.charAt(start) == 'i' || 
                      s.charAt(start) == 'o' ||
                      s.charAt(start) == 'u' )
                        Vowelcount--;
                start++;
            }
            end++;
        }
        return ans;
    }
}