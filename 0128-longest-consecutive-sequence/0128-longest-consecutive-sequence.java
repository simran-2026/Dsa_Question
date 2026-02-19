class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int e : nums){
            set.add(e);
        }
        int max=0;

        for(int val : set){
            
        
            if(!set.contains(val-1)){
                int count =1;
                while(set.contains(val+1)){
                    count++;
                    val++;
                }
                max=Math.max(count,max);
            }
        }
        return max;
    }
}