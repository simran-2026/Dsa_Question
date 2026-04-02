class Solution {
    public int kthSmallest(int[] arr, int k) {
        // Code here
       int target = arr.length-1;
       return quickselect( arr, 0,arr.length-1, k-1);
        
    }
    
    private int quickselect(int[] arr,int left , int right, int k){
        int pivotIndex = partition(arr, left,right);
       
            if(pivotIndex==k) return arr[pivotIndex];
            else if(pivotIndex<k) return quickselect(arr,pivotIndex+1 , right, k);
            else return quickselect(arr,left,pivotIndex-1,k);
        }
        private void swap(int[]arr, int left , int right){
            int temp = arr[left];
            arr[left]= arr[right];
            arr[right]=temp;
            return;
        }
        
        
        private int partition(int[]arr , int left, int right){
            int pivot = arr[right];
            int p =left;
            for(int i =left; i < right;i++){
                if(arr[i]<= pivot){
                    swap(arr,p,i);
                    p++;
                }
            }
            
            swap(arr,p,right);
            return p;
        }
    }

