class Solution {
    HashMap<Integer, List<Integer>> map;
    HashSet<Integer> vis;

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        map = new HashMap<>();
        vis = new HashSet<>();
        for (int i = 0; i < n; i++) {
            map.put(i, new ArrayList<>());
        }
        for (int[] edge : edges) {
            map.get(edge[0]).add(edge[1]);
            map.get(edge[1]).add(edge[0]);
        }
        return dfs(map, source, destination);

    }

    private boolean dfs(HashMap<Integer, List<Integer>> map, int sr, int dest) {
        if (sr == dest)
            return true;

        vis.add(sr);

        for (int nei : map.get(sr)) {
            if (!vis.contains(nei)) {
                if (dfs(map, nei, dest)) {
                    return true;
                }
            }
        }
        return false;
    }
}