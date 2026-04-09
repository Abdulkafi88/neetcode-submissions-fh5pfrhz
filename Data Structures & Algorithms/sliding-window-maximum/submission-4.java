class Solution {
   public int[] maxSlidingWindow(int[] nums, int k) {
        int[] max = new int[nums.length - k + 1];

        Deque<Integer> deq = new ArrayDeque<>();



       for(int i = 0; i < nums.length; i++){

           while (!deq.isEmpty() && deq.peekFirst() < i - k + 1) {
               deq.removeFirst();
           }

                while(!deq.isEmpty() && nums[deq.getLast()] < nums[i]){
                    deq.removeLast();
                }

                deq.addLast(i);


            if(i >= k - 1){
                max[i - k + 1] = nums[deq.getFirst()];
            }
        }

        System.out.println(Arrays.toString(max));

        return max;
    }
}
