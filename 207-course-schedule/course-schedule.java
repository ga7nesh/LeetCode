class Solution {
    HashMap<Integer, List<Integer>> courses;
    Set<Integer> visiting;
    Set<Integer> visited;

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        courses = new HashMap<>();
        visiting = new HashSet<>();
        visited = new HashSet<>();

        for (int i = 0; i < numCourses; i++) {
            courses.put(i, new ArrayList<>());
        }

        for (int[] p : prerequisites) {
            courses.get(p[1]).add(p[0]);
        }

        for (int i = 0; i < numCourses; i++) {
            if (dfs(i)) {
                return false;
            }
        }

        return true;
    }

    private boolean dfs(int course) {
        if (visiting.contains(course))
            return true;

        if (visited.contains(course))
            return false;

        visiting.add(course);

        for (int nei : courses.get(course)) {
            if (dfs(nei)) {
                return true;
            }
        }

        visiting.remove(course);
        visited.add(course);

        return false;
    }
}