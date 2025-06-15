import java.util.HashMap;
class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String s) {
        // code here
        int n = s.length();
        HashMap <Character , Integer> map = new HashMap<>();
        map.put('I' , 1);
         map.put('V' , 5);
         map.put('X',10);
         map.put('C' , 100);
          map.put('M' , 1000);
           map.put('L' , 50);
            map.put('D' , 500);
            
            
             int res = 0;
            for(int i = 0 ; i< s.length(); i++){
                if(i+1< n && map.get(s.charAt(i))< map.get(s.charAt(i+1))){
                     
                     res += map.get(s.charAt(i+1)) - map.get(s.charAt(i));
                     
                       i++;
                }
                
              
            
            else {

                // Otherwise, add the current value to res
                res += map.get(s.charAt(i));
            }
        }

        return res;
    }
}
