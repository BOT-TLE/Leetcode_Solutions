class Solution {
    public int[] plusOne(int[] digits) {
        int val = digits[digits.length - 1];
        if(val < 9){
            digits[digits.length - 1]++;
            return digits;
        }
        else
        {
            boolean gotIt = false;
            for(int i = digits.length - 1; i >= 0 ; --i)
            {
                if(digits[i] == 9 && !gotIt)
                {
                    digits[i] = 0;
                }
                else if(digits[i] != 9 && !gotIt)
                {
                    digits[i]++;
                    gotIt = true;
                }
            }
            if(digits[0] == 0)
            {
                int ansarray[] = new int[digits.length + 1];
                ansarray[0] = 1;
                for(int i = 1 ; i < digits.length ; i++)
                    ansarray[i] = digits[i];
                return ansarray;
            }
            return digits;
            
        }
    }
}