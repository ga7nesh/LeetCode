class RandomizedSet {
    HashSet<Integer> res = new HashSet<>();

    public RandomizedSet() {

    }

    public boolean insert(int val) {
        if (res.contains(val)) {
            return false;
        } else {
            res.add(val);
            return true;
        }
    }

    public boolean remove(int val) {
        if (res.contains(val)) {
            res.remove(val);
            return true;
        } else {
            return false;
        }
    }

    public int getRandom() {
        List<Integer> list = new ArrayList<>(res);

        Random rand = new Random();
        int index = rand.nextInt(list.size());

        return list.get(index);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */