class Solution {
    public String customSortString(String order, String s) {
        StringBuilder sb = new StringBuilder(s);
        int pos = 0;
        for (int i = 0; i < order.length(); i++) {
            for (int j = 0; j < sb.length(); j++) {
                if (sb.charAt(j) == order.charAt(i)) {
                    char temp = sb.charAt(pos);
                    sb.setCharAt(pos, sb.charAt(j));
                    sb.setCharAt(j, temp);
                    pos++;
                }
            }
        }
        return sb.toString();
    }
}