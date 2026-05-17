class Solution {
    public int minCostConnectPoints(int[][] points) {
        boolean[] vis = new boolean[points.length];
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        int minCost = 0;
        minHeap.offer(new int[] { 0, 0 });

        while (!minHeap.isEmpty()) {
            int[] curr = minHeap.poll();
            int v = curr[0];
            int weight = curr[1];

            if (vis[v]) {
                continue;
            }

            vis[v] = true;
            minCost += weight;

            for (int i = 0; i < points.length; i++) {
                if (!vis[i]) {
                    int distance = Math.abs(points[i][0] - points[v][0])
                            + Math.abs(points[i][1] - points[v][1]);
                    minHeap.offer(new int[] { i, distance });
                }
            }

        }
        return minCost;
    }
}