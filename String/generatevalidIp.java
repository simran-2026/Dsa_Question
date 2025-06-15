class Solution {
    
    
    static boolean valid(String s){
        int n = s.length();
        
        
        if(n==1){
            return true;
        }
        
        int value = Integer.parseInt(s);
        if(s.charAt(0)=='0'|| value >255){
            return false;
        }
        return true;
    }
    
    static void generateipvalid(String s , int index, String curr , int cnt , ArrayList<String> res){
        String temp = "";
        
        if(index>= s.length()){
            return; 
        }
        
        if(cnt ==3){
            temp = s.substring(index);
            
            if(valid(temp) && temp.length()<= 3){
                res.add (curr + temp);
            }
            return ;
        }
        
        
        
         for(int i = index; i< Math.min(index +3 , s.length());i++){
             
             temp += s.charAt(i);
             
             if(valid(temp)){
                 generateipvalid(s , i+1, curr+temp+".", cnt+1, res);
             }
         }
    }
    public ArrayList<String> generateIp(String s) {
        // code here
        ArrayList <String> res = new ArrayList<>();
        
         if (s.length() < 4 || s.length() > 12) {
            res.add("-1");
            return res;
        }
         generateipvalid(s, 0 , "", 0 , res);
          if (res.isEmpty()) {
            res.add("-1");
        }
         
         
          return res;
    }
}
