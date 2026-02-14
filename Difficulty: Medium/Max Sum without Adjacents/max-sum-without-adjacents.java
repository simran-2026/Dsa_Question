// User function Template for Java

class Solution {
    int findMaxSum(int arr[]) {
        // code here in tn \
        int n = arr.length;
        if(n==0) return 0;
        if(n==1) return arr[0];
        int last = arr[0];
        int sl = 0;
        int res =0;
        for(int i =1;i<n;i++){
          res = Math.max(arr[i]+sl , last);
          sl = last ;
          last =res;
            
        }
        return res;
    }
}