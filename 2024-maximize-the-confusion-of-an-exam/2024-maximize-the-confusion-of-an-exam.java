class Solution {
    public int checkTheLongestSameSet(String answerkey, int k, char sameChar){
        int changeCount = 0;
        int i = 0, j = 0;
        int ans = 0;
        while(j < answerkey.length())
        {
            if(answerkey.charAt(j) == sameChar)
            {
                changeCount++;
                while(changeCount > k)
                {
                    if(answerkey.charAt(i) == sameChar)
                        changeCount--;
                    i++;
                }
            }
            ans = Math.max(ans,j-i+1);
            j++;
        }
        return ans;
    }
    
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int allTrue = checkTheLongestSameSet(answerKey,k,'F');
        int allFalse = checkTheLongestSameSet(answerKey,k,'T');
        if(allTrue > allFalse)
            return allTrue;
        return allFalse;
    }
}