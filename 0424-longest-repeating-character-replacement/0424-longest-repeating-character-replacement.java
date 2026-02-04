class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq= new int[26];
        int j =0;
        int maxlength=0;
        int maxfreq=0;
        for(int i =0; i <s.length();i++){
            freq[s.charAt(i) -'A']++;
            maxfreq= Math.max(maxfreq,freq[s.charAt(i)-'A']);

            while((i-j+1) - maxfreq >k){
                freq[s.charAt(j)-'A']--;
                j++;
            } 
            maxlength= Math.max(maxlength,i-j+1);
        }
        return maxlength;
    }
}