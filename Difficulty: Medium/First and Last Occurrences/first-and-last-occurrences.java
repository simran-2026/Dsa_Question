class Solution {
    
    public static int first(int[]arr,int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
    public static int last(int []arr, int x){
        int n =arr.length;
        for(int i = n-1;i>=0;i--){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
    
    
    
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        ArrayList<Integer>res =new ArrayList<>();
        res.add(first(arr,x));
        res.add(last(arr,x));
        return res;
    }
}
