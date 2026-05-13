class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;
        double[] temp = new double[n1 + n2];
        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (nums1[i] <= nums2[j]) {
                temp[k] = nums1[i];
                i++;
            } else {
                temp[k] = nums2[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            temp[k] = nums1[i];
            i++;
            k++;
        }

        while (j < n2) {
            temp[k] = nums2[j];
            j++;
            k++;
        }

        int n = n1 + n2;

        if (n % 2 == 1)
            return temp[n / 2];

        return (temp[n / 2] + temp[(n - 1) / 2]) / 2.0;
    }
}