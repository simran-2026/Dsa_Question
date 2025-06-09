class Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        // code here
        Arrays.sort(arr);
        int n = arr.length;
        int left=0 ;
        int right = arr.length-1;
        
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        
         while(left<right){
              int cs = arr[left]+arr[right];
              if(cs==0){
                  ArrayList<Integer> pair = new ArrayList<>();
                  pair.add(arr[left]);
                  pair.add(arr[right]);
                  result.add(pair);
                   while (left < right && arr[left] == arr[left + 1]) {
                    left++;
                }
                // Skip duplicates for right pointer
                while (left < right && arr[right] == arr[right - 1]) {
                    right--;
                }
                left++;
                right--;
            } else if (cs< 0) {
                left++;
            } else {
                right--;
            }
        }
        
        return result;
              }
         }
    
