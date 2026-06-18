class Solution {

    public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            Integer p1 = map1.put(s.charAt(i), i);
            Integer p2 = map2.put(t.charAt(i), i);

            if (!Objects.equals(p1, p2)) {
                return false;
            }
        }

        return true;
    }
}