class Solution {
    public int minimumLength(String s) {
        if(s.length() == 1){
            return 1;
        }
        int left = 0;
        int right = s.length()-1;
        char lastLeft = s.charAt(0);
        char lastRight = s.charAt(right);
        if(lastRight!= lastLeft){
            return right+1;
        }
        while(left<right){
            if(s.charAt(left)==s.charAt(right)){
                lastLeft = s.charAt(left);
                lastRight = s.charAt(right);
                left++;
                right--;
            }
            else if(lastLeft == s.charAt(left)){
                left++;
            }
            else if(lastRight == s.charAt(right)){
                right--;
            }
            else{
                break;
            }
        }
        if(left==right && (lastRight == s.charAt(right) ||lastLeft == s.charAt(left) )){
            return 0;
        }
        return right-left+1;
    }
}