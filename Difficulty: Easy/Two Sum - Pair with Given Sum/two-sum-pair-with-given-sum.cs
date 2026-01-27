class Solution {
    public bool twoSum(int[] arr, int target) {
        // code here
        HashSet<int> res = new HashSet<int>();
    
        
        for(int i =0 ; i<arr.Length;i++){
            int complement  = target - arr[i];
            if(res.Contains(complement)){
                return true;
            }else{
                res.Add(arr[i]);
            }
        }
        return false;
    }
}