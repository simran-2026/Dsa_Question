class Solution {
    public String removeConsecutiveCharacter(String s) {
        int n = s.length();
        if(n == 0) {
            return s;
        }
        
        StringBuilder res = new StringBuilder();
        res.append(s.charAt(0));
        
        for(int i = 1; i < n; i++) {
            if(s.charAt(i) != s.charAt(i-1)) {
                res.append(s.charAt(i));
            }
        }
        
        return res.toString();
    }
}
