class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        int start =0;
        int end =0;
        int res = 0;
        HashSet<Character> set = new HashSet<>();
        while(end < s.length()){
           
            while(set.contains(s.charAt(end))){
                set.remove(s.charAt(start));
                start++;
    
            }
            
            set.add(s.charAt(end));
            
            res = Math.max(res,end-start+1);
            end++;
            
            
            
        }
        return res;
    }
}