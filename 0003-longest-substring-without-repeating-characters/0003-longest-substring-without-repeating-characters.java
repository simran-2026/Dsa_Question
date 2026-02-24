class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start =0;
        boolean [] vis = new boolean[128];
        int maxLen= 0;
        for(int end=0;end<s.length();end++){
            
            while(vis[s.charAt(end)]==true){
                vis[s.charAt(start)]=false;
                start++;
            }
            vis[s.charAt(end)]=true;
            maxLen= Math.max(end-start+1,maxLen);
        }
        return maxLen;
    }
}