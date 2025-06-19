class Solution {
    int transform(String A, String B) {
        // code here
        int n = A.length();
        int m = B.length();
        
        if( n != m ){
            return -1;
        }
        
        HashMap<Character,Integer> mapA = new HashMap<Character, Integer>();
        
       
        
        for(int i = 0 ; i < n ; i++){
            if(mapA.containsKey(A.charAt(i))){
                 mapA.put(A.charAt(i),mapA.get(A.charAt(i))+1);
            }
           else{ mapA.put(A.charAt(i),1);
               
           }
        }
        
        for(int i=0; i< n;i++){
            if(mapA.containsKey(B.charAt(i))){
                mapA.put(B.charAt(i),mapA.get(B.charAt(i))-1);
                
            }
        }
        
        for(Map.Entry<Character , Integer> entry : mapA.entrySet()){
            if(entry.getValue()!=0) {
                return -1;
            }  
            
            
        }
        
        
        int i = n-1; 
        int j = n-1;
        int res = 0;
        
        
        while(i>=0 && j>=0){
            while(i>=0 && A.charAt(i)!= B.charAt(j)){
                res++;
                i--;
            }
            i--;
            j--;
        }
        return res;
        
    }
}
