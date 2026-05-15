class Trie {

    private Trie[] children;

    private boolean end;

    public Trie() {
        children = new Trie[26];
        end = false;
    }

    public void insert(String word) {
        Trie curr = this;

        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (curr.children[index] == null) {
                curr.children[index] = new Trie();
            }
            curr = curr.children[index];
        }
        curr.end = true;
    }

    public boolean search(String word) {
        Trie prefixNodeEnd = searchPrefix(word);

        return prefixNodeEnd != null && prefixNodeEnd.end;
    }

    public boolean startsWith(String prefix) {
        Trie startsWith = searchPrefix(prefix);

        return startsWith != null;
    }

    public Trie searchPrefix(String word) {
        Trie curr = this;

        for (char c : word.toCharArray()) {
            int index = c - 'a';

            if (curr.children[index] == null) {
                return null;
            }
            curr = curr.children[index];
        }
        return curr;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */