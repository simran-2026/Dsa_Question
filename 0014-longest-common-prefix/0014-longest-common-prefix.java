class Solution {
    public String longestCommonPrefix(String[] arr) {

         if (arr == null || arr.length == 0) return "";

        // if any string is empty → no common prefix
        for (String s : arr) {
            if (s.length() == 0) return "";
        }





        int min=arr[0].length();
        for(int i =1;i<arr.length;i++){
            min =Math.min(min, arr[i].length());
        }
        StringBuilder res = new StringBuilder();
        String pre=arr[0];
        for(int i =0; i<arr.length;i++){
            if(arr[0].charAt(0) != arr[i].charAt(0)){
                return res.toString();
            }
        }
       res.append(pre.charAt(0));
       int j =1;
       while(j< min){
        char val = pre.charAt(j);
        for(int i = 1 ; i< arr.length;i++){
            if(val != arr[i].charAt(j)){
                return res.toString();
            }
        }
        res.append(val);
        j++;
       }

     return res.toString();
    }
}