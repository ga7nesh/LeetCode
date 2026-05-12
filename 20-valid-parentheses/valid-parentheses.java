class Solution {
    public boolean isValid(String s) {
        int n = s.length();

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == '{' || c == '(' || c == '[') {
                st.push(c);
            } else if (c == '}' || c == ')' || c == ']') {
                if (st.isEmpty())
                    return false;

                char top = st.peek();
                if (c == '}' && top == '{')
                    st.pop();
                else if (c == ')' && top == '(')
                    st.pop();
                else if (c == ']' && top == '[')
                    st.pop();
                else
                    return false;
            }
        }
        return st.isEmpty();
    }
}