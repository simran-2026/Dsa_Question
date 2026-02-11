class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        
        ArrayList<Integer> res = new ArrayList<>();
        Arrays.sort(arr);
        int repeat = -1;
        int miss =1;
        for(int i =0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                repeat = arr[i];
            }
            if(arr[i+1] - arr[i]>1){
                miss =arr[i]+1;
            }
        }
        if(arr[arr.length-1] != arr.length){
            miss = arr.length;
        }
        res.add(repeat);
        res.add(miss);
        
        
        return res;
    }
}
