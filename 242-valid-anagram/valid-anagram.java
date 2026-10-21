class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Character,Integer> map1 = new HashMap<>();
        int n = s.length();
        int m = t.length();

        if(n!=m) return false;
        else{
            for(int i=0;i<n;i++){
                if(map.containsKey(s.charAt(i))){
                    map.put(s.charAt(i),map.get(s.charAt(i))+1);
                }
                else{
                    map.put(s.charAt(i),1);
                }
            }
            for(int i=0;i<m;i++){
                if(map1.containsKey(t.charAt(i))){
                    map1.put(t.charAt(i),map1.get(t.charAt(i))+1);
                }
                else{
                    map1.put(t.charAt(i),1);
                }
            }
            if(map.equals(map1)) return true;
        }
        return false;
    }
}