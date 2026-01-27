class GFG {
    
    static int first(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int ans = -1;
        
        while (low <= high) {
            int mid = (low + high) / 2;
            
            if (arr[mid] == x) {
                ans = mid;
                high = mid - 1;   // go left
            } else if (arr[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
    
    static int last(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int ans = -1;
        
        while (low <= high) {
            int mid = (low + high) / 2;
            
            if (arr[mid] == x) {
                ans = mid;
                low = mid + 1;   // go right
            } else if (arr[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
    
    ArrayList<Integer> find(int arr[], int x) {
        ArrayList<Integer> res = new ArrayList<>();
        res.add(first(arr, x));
        res.add(last(arr, x));
        return res;
    }
}
