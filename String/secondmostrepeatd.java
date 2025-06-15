class Solution {
    String secFrequent(String arr[], int N) {
        // your code here
        Map <String , Integer> map = new HashMap<>();
        for( String word : arr){
            map.put(word, map.getOrDefault(word,0)+1);
        }
        
        int max1= 0;
        int max2 =0 ;
        String smax1="";
        String smax2="";
        
        for(Map.Entry<String , Integer> entry: map.entrySet() ){
            if(entry.getValue()>max1)
            {
                max2 = max1;
                max1= entry.getValue();
                smax2= smax1;
                smax1 = entry.getKey();
            }else if( entry.getValue() > max2 && entry.getValue()< max1){
                max2 = entry.getValue();
                smax2 = entry.getKey();
                
            }
        }
        return smax2;
    }
}
