class Solution {
    public String longestCommonPrefix(String[] strs) {
         int minlength = strs[0].length();

         for(String s : strs){
           minlength = Math.min( minlength ,s.length());
         }

         StringBuilder sb = new StringBuilder();
         for(int i  = 0 ; i< minlength; i++){
            char ch = strs[0].charAt(i);

         for(String str:strs){
            if(str.charAt(i) != ch){
                return sb.toString();
            }
         }

         sb.append(ch);
          }

          return sb.toString();

    }
}
