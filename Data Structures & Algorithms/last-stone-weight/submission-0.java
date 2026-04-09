class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length == 1){
            return stones[0];
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> (b - a));

        for(int stone: stones){
            maxHeap.add(stone);
        }
        while(maxHeap.size() > 1){
            int x = maxHeap.poll();
            int y = maxHeap.poll();
            if(x > y){
                maxHeap.add(x - y);
            }else{
                maxHeap.add(y - x);
            }
        }

        return maxHeap.peek();
    }
}
