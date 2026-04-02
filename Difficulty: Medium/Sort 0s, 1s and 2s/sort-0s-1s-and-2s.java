class Solution {
    public void sort012(int[] arr) {
        int zi = 0;
        int i = 0;
        int ti = arr.length - 1;

        while (i <= ti) {
            if (arr[i] == 0) {
                swap(arr, i, zi);
                zi++;
                i++;
            } 
            else if (arr[i] == 1) {
                i++;
            } 
            else { // arr[i] == 2
                swap(arr, i, ti);
                ti--;
                // ❗ DO NOT increment i here
            }
        }
    }

    private void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}