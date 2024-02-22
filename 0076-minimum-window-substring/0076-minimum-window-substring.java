class Solution {
    public String minWindow(String s, String t) {
        
        // Base case
        if(s.equals(t))
            return t;
        if(s.length() < t.length())
            return "";
        
        Map<Character,Integer> mp1 = new HashMap<>(); // TO store the key-value pair for the desired string i.e. T 
        for(int i = 0 ; i < t.length() ; i++) // Store all the key-value pair within map 1
        {
            if(!mp1.containsKey(t.charAt(i)))
                mp1.put(t.charAt(i),1);
            else{
                int freq = mp1.get(t.charAt(i));
                mp1.put(t.charAt(i),freq+1);
            }
        }
        
        int MapOneSize = mp1.size(); // Because of this we don't have to travel the map again and again 
        
        int start = 0 , end = 0;
        int first = 0, last = 0; // To store the latest index of the string 
        int ans = Integer.MAX_VALUE;
        int prevAns = Integer.MAX_VALUE; 
        
        while(end < s.length())
        {
            if(mp1.containsKey(s.charAt(end)))
            {
                int freq = mp1.get(s.charAt(end));
                mp1.put(s.charAt(end),freq-1);
                if(mp1.get(s.charAt(end)) == 0)
                    MapOneSize--;  // Instead of removing the element we will decrement the size count 
            }
            while(MapOneSize == 0)
            {
                if(mp1.containsKey(s.charAt(start)))
                {
                    int freq = mp1.get(s.charAt(start));
                    mp1.put(s.charAt(start),freq + 1);
                    if(mp1.get(s.charAt(start)) == 1)
                    {
                        MapOneSize++;
                        
                        if(end-start + 1 < ans)
                        {
                            ans = end - start + 1;
                            if(prevAns > ans) 
                            {
                                prevAns = ans;
                                first = start;
                                last = end;
                            } 
                        }

                    }
                }
                start++;
            }
            end++;
        }
        
        System.out.println(first + " "+ last);
        
        if(ans == Integer.MAX_VALUE)
            return "";
        
        String result = "";
        for(int i = first ; i <= last ; i++)
            result += s.charAt(i);
        return result;
        
    }
}