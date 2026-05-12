class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length, area = 0, width = 0;
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && heights[i] < heights[st.peek()]) {
                int index = st.pop();
                if (st.isEmpty())
                    width = i;
                else
                    width = i - st.peek() - 1;
                area = Math.max(area, heights[index] * width);
            }
            st.push(i);
        }
        while (!st.isEmpty()) {
            int index = st.pop();
            if (st.isEmpty())
                width = n;
            else
                width = n - st.peek() - 1;
            area = Math.max(area, heights[index] * width);
        }
        return area;
    }
}