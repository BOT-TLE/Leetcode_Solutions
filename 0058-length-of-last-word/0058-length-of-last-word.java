class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        boolean gotword = false;
        for(int i = s.length() - 1 ; i >= 0 ; i--)
        {
            if(s.charAt(i) == ' ' && !gotword)
                continue;
            
            if(s.charAt(i) == ' ' && gotword)
                break;
            
            if(s.charAt(i) != ' '){
                gotword = true;
                count++;
            }
        }
        return count;
    }
}