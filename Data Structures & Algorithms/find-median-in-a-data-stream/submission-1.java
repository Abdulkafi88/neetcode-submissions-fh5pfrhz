class MedianFinder {
    List<Integer> data;
    public MedianFinder() {
        data = new ArrayList<>();
    }
    
    public void addNum(int num) {
        data.add(num);
    }
    
    public double findMedian() {
        Collections.sort(data);
        double median = 0.0;
        if(data.size() % 2 == 0){
            int firstNum = (data.size() / 2) - 1;
            int secondNum = data.size() / 2;
            System.out.println(data.get(firstNum));
             System.out.println(data.get(secondNum));
            median = ((data.get(firstNum) + data.get(secondNum)) / 2.0);
        }else{
            median = data.get(data.size() / 2);
        }
        return median;
    }
    // [1, 3] 
}
