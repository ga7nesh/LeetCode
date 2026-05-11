class Solution {
    public String minWindow(String s, String t) {
        int i = 0, j = 0;
        int n = s.length(), m = t.length();

        Map<Character, Integer> needMap = new HashMap<>();
        Map<Character, Integer> windowMap = new HashMap<>();

        for (int k = 0; k < m; k++) {
            needMap.put(t.charAt(k), needMap.getOrDefault(t.charAt(k), 0) + 1);
        }
        int minLen = Integer.MAX_VALUE;
        int start = 0;
        while (j < n) {
            windowMap.put(s.charAt(j), windowMap.getOrDefault(s.charAt(j), 0) + 1);
            while (valid(needMap, windowMap)) {
                if ((j - i + 1) < minLen) {
                    minLen = j - i + 1;
                    start = i;
                }

                windowMap.put(s.charAt(i), windowMap.getOrDefault(s.charAt(i), 0) - 1);
                i++;
            }
            j++;
        }
        if (minLen == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start, start + minLen);
    }

    public boolean valid(Map<Character, Integer> needMap,
            Map<Character, Integer> windowMap) {

        for (char ch : needMap.keySet()) {

            if (windowMap.getOrDefault(ch, 0) < needMap.get(ch)) {

                return false;
            }
        }

        return true;
    }
}
