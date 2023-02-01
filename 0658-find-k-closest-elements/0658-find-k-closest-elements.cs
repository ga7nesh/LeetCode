public class Solution {
    public IList<int> FindClosestElements(int[] arr, int k, int x) {
        int left = 0;
        int right = arr.Length - k;
        while (left < right) {
            int mid = left + right >> 1;
            if (x - arr[mid] > arr[mid + k] - x) left = mid + 1;
            else right = mid;
                
        }
        int[] res = new int[k];
        for (int i = left, j = 0; i < left + k; i++, j++) {
            res[j] = arr[i];
        }
        return res;
    }
}
