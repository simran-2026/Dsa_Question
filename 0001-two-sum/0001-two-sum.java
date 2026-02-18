class Solution {
    public int[] twoSum(int[] arr, int target) {
        
       HashMap<Integer,Integer> map = new HashMap<>();
       

       for(int i = 0;i<arr.length;i++){
        int val = target-arr[i];
        if(map.containsKey(val)){
            return new int[]{map.get(val),i};
        }

        map.put(arr[i],i);
       }

       return new int[]{-1 ,-1};
    }
}