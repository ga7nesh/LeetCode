class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backTrack(res, "", 0, 0, n);
        return res;
    }

    public void backTrack(List<String> res, String curr, int open, int close, int n) {
        if (curr.length() == 2 * n) {
            res.add(curr);
            return;
        }

        if (open < n) {
            backTrack(res, curr + "(", open + 1, close, n);
        }
        if (close < open) {
            backTrack(res, curr + ")", open, close + 1, n);
        }
    }
}