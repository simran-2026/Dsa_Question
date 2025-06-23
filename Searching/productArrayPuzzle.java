class Solution {
    public static int[] productExceptSelf(int arr[]) {
        int n = arr.length;
        int product = 1;
        int idx = -1;
        int cnt = 0;
        int[] res = new int[n];
        
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                cnt++;
                idx = i;
            } else {
                product *= arr[i];
            }
        }
        
        if (cnt > 1) {
            for (int i = 0; i < n; i++) {
                res[i] = 0;
            }
        } else if (cnt == 1) {
            for (int i = 0; i < n; i++) {
                if (i == idx) {
                    res[i] = product;
                } else {
                    res[i] = 0;
                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                res[i] = product / arr[i];
            }
        }
        
        return res;
    }
}
