class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        int i = 0, j = n - 1;
        Map<Character, Integer> orgMap = new HashMap<>();
        Map<Character, Integer> map = new HashMap<>();

        if(n>m) return false;

        for (int x = 0; x < n; x++) {
            orgMap.put(s1.charAt(x), orgMap.getOrDefault(s1.charAt(x), 0) + 1);
        }

        for (int k = 0; k <= j; k++) {
            map.put(s2.charAt(k), map.getOrDefault(s2.charAt(k), 0) + 1);
        }

        while (j < m-1) {
            if (orgMap.equals(map)) {
                return true;
            }

            map.put(s2.charAt(i), map.get(s2.charAt(i)) - 1);

            if (map.get(s2.charAt(i)) == 0) {
                map.remove(s2.charAt(i));
            }

            i++;
            j++;

            map.put(s2.charAt(j), map.getOrDefault(s2.charAt(j), 0) + 1);
        }

        return orgMap.equals(map);
    }
}