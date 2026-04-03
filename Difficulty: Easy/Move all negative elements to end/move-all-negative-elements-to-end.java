// User function Template for Java

class Solution {
    public void segregateElements(int[] arr) {
        // Your code goes here
        int[] temp = new int[arr.length];
        int i =0;
        for(int j : arr){
           if(j >=0){
               temp[i]=j;
               i++;
           }
        }
        for(int j: arr)
        {
            if(j<0){
                temp[i]=j;
                i++;
            }
        }
        for(int k=0; k<temp.length;k++){
            arr[k]= temp[k];
        }
    }
}