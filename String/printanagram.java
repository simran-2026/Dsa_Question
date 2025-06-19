class Solution {
    
    static final int Max_Char =26;
    
    static String hashValue (String s){
        StringBuilder hash = new StringBuilder();
        int[] freq = new int[Max_Char];
        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }
        
        for(int i = 0 ; i<Max_Char;i++){
            hash.append(freq[i]);
            hash.append("$");
            
        }
        return hash.toString();
    }
    
    
    
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        // code here
        ArrayList<ArrayList<String>> res = new ArrayList<>();
         Map <String , Integer> mp = new HashMap<>();
        for(int i = 0 ; i<arr.length; i++){
            String key = hashValue(arr[i]);
            if(!mp.containsKey(key)){
                mp.put(key, res.size());
                res.add(new ArrayList<>());
            }
            
            res.get(mp.get(key)).add(arr[i]);
        }
        
        return res;
        
    }
}
