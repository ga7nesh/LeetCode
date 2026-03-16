class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        Boolean flag = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                st.push(c);
            } else {
                if(st.isEmpty()) return false;
                char val = st.peek();
                st.pop();

                if (val == '(' && c != ')')
                    return false;
                if (val == '[' && c != ']')
                    return false;
                if (val == '{' && c != '}')
                    return false;
                if (st.isEmpty()) {
                    flag = true;

                }
            }
        }
        if(st.isEmpty()){
        return true;
        }
        else{
            return false;
        }
    }
}