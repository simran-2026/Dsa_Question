class Solution {
    static boolean palin( int x){

    String s = Integer.toString(Math.abs(x));
     int len = s.length();

        for (int i = 0; i < len / 2; i++) {

            // Comparing i th character from starting
            //  and len-i th character from end
            if (s.charAt(i) != s.charAt(len - i - 1))
                return false;
        }
        return true;
    }
    public static boolean isPalinArray(int[] arr) {
        // add code here
        int n=arr.length;
        for(int i = 0 ; i<n;i++){
            if(!palin(arr[i])){
                return false;
            }
        }
        return true;
    }
}
