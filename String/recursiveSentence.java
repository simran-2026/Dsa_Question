class Solution {
    public static ArrayList<ArrayList<String>> sentences(String[][] list) {
        // code here
        ArrayList<ArrayList<String>> result  = new ArrayList<>();
        if(list == null || list.length ==0){
            return result;
        }
        gensentence(list, 0 , new ArrayList<>() , result);
        return result;
        
        
    }
    
    
    private static void gensentence(String[][] list , int curridx, ArrayList<String> cursentence, ArrayList<ArrayList<String>> result){
        if(curridx == list.length){
            result.add(new ArrayList<>(cursentence));
            return;
        }
        
        String[] currwordArray = list[curridx];
        for(String word : currwordArray){
            cursentence.add(word);
            gensentence( list, curridx+1, cursentence,result);
            cursentence.remove (cursentence.size()-1);
        }
    }
}
