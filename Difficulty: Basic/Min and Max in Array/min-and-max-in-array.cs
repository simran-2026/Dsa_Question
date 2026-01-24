using System;
using System.Collections.Generic;

public class Solution {
    public List<int> getMinMax(int[] arr) {
        // code here
        List<int> res = new List<int>();
        int max = arr[0];
        int min=arr[0];
        for(int i =1; i< arr.Length;i++){
            max = Math.Max(max, arr[i]);
            min= Math.Min(min, arr[i]);
        }
        
        res.Add(min);
        res.Add(max);
        return res;
    }
}
