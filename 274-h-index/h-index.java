class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length, i = 0, res = 0;
        Arrays.sort(citations);

        while (i < n) {
            int val = citations[i];
            if (val >= (n - i)) {
                return (n - i);
            }
            i++;
        }
        return res;
    }
}