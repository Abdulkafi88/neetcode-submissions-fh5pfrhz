class MedianFinder {
    PriorityQueue<Integer> maxHeap;
    PriorityQueue<Integer> minHeap;
    public MedianFinder() {
        maxHeap = new PriorityQueue<>((a,b) -> b - a);
        minHeap = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        if(maxHeap.isEmpty() || num <= maxHeap.peek()){
            maxHeap.offer(num);
        }else{
            minHeap.offer(num);
        }
        
       if(maxHeap.size() > minHeap.size() + 1){
            minHeap.offer(maxHeap.poll());
       }else if(maxHeap.size() < minHeap.size()){
            maxHeap.offer(minHeap.poll());
       }
    }
    
    public double findMedian() {
        double median = 0.0;
        if((maxHeap.size() + minHeap.size()) % 2 == 0){
            median = (minHeap.peek() + maxHeap.peek()) / 2.0;
        }else{
            median = maxHeap.peek();
        }
        return median;
    }
    // [1, 3] 
}
