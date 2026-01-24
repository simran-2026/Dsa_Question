class Solution
{
    int Partition(int[] arr, int left, int right)
    {
        int pivot = arr[right];
        int i = left;

        for (int j = left; j < right; j++)
        {
            if (arr[j] <= pivot)
            {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
            }
        }

        int tempPivot = arr[i];
        arr[i] = arr[right];
        arr[right] = tempPivot;

        return i;
    }

    int Util(int[] arr, int left, int right, int k)
    {
        if (left == right)
            return arr[left];

        int pivotIndex = Partition(arr, left, right);

        if (pivotIndex == k)
            return arr[pivotIndex];
        else if (pivotIndex > k)
            return Util(arr, left, pivotIndex - 1, k);
        else
            return Util(arr, pivotIndex + 1, right, k);
    }

    public int kthSmallest(int[] arr, int k)
    {
        return Util(arr, 0, arr.Length - 1, k - 1);
    }
}
