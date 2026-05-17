class Solution {
    HashMap<Integer, List<Integer>> map;
    Set<Integer> visited;
    Set<Integer> visiting;
    List<Integer> order;

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        map = new HashMap<>();
        visiting = new HashSet<>();
        visited = new HashSet<>();
        order = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            map.put(i, new ArrayList<>());
        }
        for (int[] p : prerequisites) {
            map.get(p[0]).add(p[1]);
        }

        for (int i = 0; i < numCourses; i++) {
            if (dfs(i)) {
                return new int[] {};
            }
        }

        int[] array = new int[order.size()];
        for (int i = 0; i < order.size(); i++) {
            array[i] = order.get(i);
        }
        return array;
    }

    private boolean dfs(int course) {
        if (visiting.contains(course))
            return true;

        if (visited.contains(course))
            return false;

        visiting.add(course);

        for (int nei : map.get(course)) {
            if (dfs(nei))
                return true;
        }

        visited.add(course);
        visiting.remove(course);
        order.add(course);

        return false;
    }
}