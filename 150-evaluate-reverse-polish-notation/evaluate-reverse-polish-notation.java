class Solution {
    public int evalRPN(String[] tokens) {
        int n = tokens.length, res = 0;
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            if (tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("/") || tokens[i].equals("*")) {
                int val1 = st.pop();
                int val = st.pop();
                if (tokens[i].equals("+")) {
                    res = val + val1;
                    st.push(res);
                }
                if (tokens[i].equals("*")) {
                    res = val * val1;
                    st.push(res);
                }
                if (tokens[i].equals("/")) {
                    res = val / val1;
                    st.push(res);
                }
                if (tokens[i].equals("-")) {
                    res = val - val1;
                    st.push(res);
                }
            } else {
                st.push(Integer.parseInt(tokens[i]));
            }
        }
        return st.peek();

    }
}