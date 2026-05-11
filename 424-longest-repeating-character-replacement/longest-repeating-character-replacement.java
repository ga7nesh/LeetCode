class Solution {
    public int characterReplacement(String s, int k) {
        int i=0,j=0, res=0;
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        int maxfreq = 0;
        
        while(j<n){
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            maxfreq = Math.max(maxfreq, map.get(s.charAt(j)));
            
            if((j-i+1)-maxfreq>k){
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)-1);
                i++;
            }
            res = Math.max(res, j - i + 1);

            j++;
        }

        return res;
    }
}