class Solution{
    public String reverseWords(String s)
    {
        String ans = "";
        String check = "";
        boolean gotWord = false, firstGap = false;
        for(int i = s.length() -1 ; i >= 0 ; i--)
        {
            if(s.charAt(i) != ' ')
            {
                if(firstGap)
                {
                    ans += ' ';
                    firstGap = false;
                }
                check += s.charAt(i);
                gotWord = true;
            }
            else{
                if(!gotWord)
                    continue;
                else{
                    StringBuilder sb = new StringBuilder();
                    sb.append(check);
                    sb.reverse();
                    ans += sb;
                    check = "";
                    gotWord = false;
                    firstGap = true;
                }
            }
        }
        if(check != "")
        {
            StringBuilder sb = new StringBuilder();
            sb.append(check);
            sb.reverse();
            ans += sb;
        }
        return ans;
    }
}