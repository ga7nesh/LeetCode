class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int n = points.length;
        int[][] res = new int[k][2];
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        for (int i = 0; i < n; i++) {
            int dis = points[i][0] * points[i][0] + points[i][1] * points[i][1];
            minHeap.add(new int[] { dis, i });
        }

        for (int i = 0; i < k; i++) {
            int[] curr = minHeap.poll();

            res[i] = points[curr[1]];
        }

        return res;
    }
}