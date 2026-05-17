class Solution {
    Map<Integer, List<Integer>> map;

    public int[] findRedundantConnection(int[][] edges) {
        map = new HashMap<>();

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            map.putIfAbsent(u, new ArrayList<>());
            map.putIfAbsent(v, new ArrayList<>());

            if (dfs(u, v, new HashSet<>(), map)) {
                return new int[] { u, v };
            }
            map.get(u).add(v);
            map.get(v).add(u);

        }
        return new int[] {};
    }

    private boolean dfs(int curr, int target, Set<Integer> visited, Map<Integer, List<Integer>> map) {
        if (curr == target) {
            return true;
        }

        visited.add(curr);
        for (int nei : map.get(curr)) {
            if (!visited.contains(nei)) {
                if (dfs(nei, target, visited, map)) {
                    return true;
                }
            }
        }

        return false;
    }
}