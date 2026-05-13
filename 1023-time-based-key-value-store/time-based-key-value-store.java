class TimeMap {
    Map<String, TreeMap<Integer, String>> map = new HashMap<>();

    public TimeMap() {

    }

    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key, new TreeMap<>());

        map.get(key).put(timestamp, value);

    }

    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) {
            return "";
        }

        TreeMap<Integer, String> tm = map.get(key);
        Integer t = tm.floorKey(timestamp);

        if (t == null) {
            return "";
        }
        return tm.get(t);
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */