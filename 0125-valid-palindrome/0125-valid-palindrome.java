class Solution {
    public boolean checkTheString(String check)
    {
        int start = 0; 
        int end = check.length()-1;
        while(start < end)
        {
            if(check.charAt(start) != check.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public boolean isPalindrome(String s) {
        String check = "";
        for(int i = 0 ; i < s.length(); i++)
        {
            if(s.charAt(i) >= 97 && s.charAt(i) <= 122)
                check += (s.charAt(i));
            if(s.charAt(i) >= 65 && s.charAt(i) <= 90)
                check += (char)(s.charAt(i) + 32);
            if(s.charAt(i) >= 48 && s.charAt(i) <= 57)
                check += (char)(s.charAt(i));
        }
        System.out.println(check);
        return checkTheString(check);
        
    }
}