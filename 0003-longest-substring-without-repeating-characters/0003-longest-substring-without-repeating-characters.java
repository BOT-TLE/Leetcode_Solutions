class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> mp = new HashMap<>();
        int start = 0, end =0;
        int ans = 0;
        char defaulter = 0;
        boolean flag = false;
        while(end < s.length())
        {
            if(!mp.containsKey(s.charAt(end)))
                mp.put(s.charAt(end),1);
            else{
                flag = true;
                defaulter = s.charAt(end);
                int freq = mp.get(s.charAt(end));
                mp.put(s.charAt(end),freq+1);
            } 
            if(flag){
                while(mp.get(defaulter) > 1 )
                {
                    char ch = s.charAt(start);
                    int chVal = mp.get(ch);
                    mp.put(ch,chVal-1);

                    if(mp.get(ch) == 0)
                        mp.remove(ch);
                    start++;
                }
                flag = false;
            }
            ans = Math.max(ans,end-start+1);
            end++;
        }
        return ans;
    }
}