class Solution {
    public int lastStoneWeight(int[] stones) {
        int n = stones.length;
        if(n==1) return 1;

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int i:stones){
            maxHeap.add(i);
        }
        while(maxHeap.size()>=2){
            int rem = maxHeap.poll() - maxHeap.peek();
            maxHeap.poll();
            maxHeap.add(rem);
        }
        return maxHeap.peek();
    }
}