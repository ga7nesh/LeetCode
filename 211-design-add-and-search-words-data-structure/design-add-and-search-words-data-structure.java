class WordDictionary {
    private WordDictionary[] children;
    private boolean end;

    public WordDictionary() {
        children = new WordDictionary[26];
        end = false;
    }

    public void addWord(String word) {
        WordDictionary curr = this;

        for (char c : word.toCharArray()) {
            int index = c - 'a';

            if (curr.children[index] == null) {
                curr.children[index] = new WordDictionary();
            }
            curr = curr.children[index];
        }
        curr.end = true;
    }

    public boolean search(String word) {
        return dfs(word, 0, this);
    }

    public boolean dfs(String word, int i, WordDictionary node) {
        if (i == word.length()) {
            return node.end;
        }
        char c = word.charAt(i);

        if (c != '.') {
            int index = c - 'a';
            if (node.children[index] == null) {
                return false;
            }
            return dfs(word, i + 1, node.children[index]);
        } else {
            for (WordDictionary child : node.children) {
                if (child != null && dfs(word, i + 1, child)) {
                    return true;
                }
            }
            return false;
        }
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */