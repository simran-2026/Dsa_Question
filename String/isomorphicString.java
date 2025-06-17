class Solution {
    public static boolean areIsomorphic(String s1, String s2) {
        // code here
        
        if( s1.length() != s2.length()){
            return false;
        }
        HashMap <Character, Integer> m1 = new HashMap<>();
        HashMap<Character,Integer> m2 = new HashMap<>();
        
        for (int i = 0 ; i<s1.length();i++){
             char c1 = s1.charAt(i);
             char c2 = s2.charAt(i);
             
              if(!m1.containsKey(c1)){
                  m1.put(c1, i );
              }
              
              if(!m2.containsKey(c2)){
                   m2.put(c2,i);
              }
              
            
                  if(m1.get(s1.charAt(i)) != m2.get(s2.charAt(i))){
                      return false ;
                  }
             
        }
        return true;
    }
}
