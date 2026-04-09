class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<>();

        for(int number : nums){
            count.put(number, count.getOrDefault(number, 0) + 1);
        }

        //Create a empty array to act as a bucket
        List<Integer>[] buckets = new ArrayList[nums.length + 1];


        for(Map.Entry<Integer, Integer> entry : count.entrySet()){
            int number = entry.getKey();
            int f = entry.getValue();

            if(buckets[f] == null){
                buckets[f] = new ArrayList<>();
            }
            buckets[f].add(number);
        }

        int[] result = new int[k]; // Final answer that we will return 
        int idx = 0; // where to put the next number 

        // go from the last number down to the first number in the array
        for(int f = buckets.length - 1; f >= 1 && idx < k; f--){
            if(buckets[f] != null){ // Skip empty buckets
                for(int number : buckets[f]){// Go through the number in this bucket
                    result[idx++] = number; // add the number to idx
                    if(idx == k) break; //Stop once we've added k numbers 
                }
            }
        }
        return result;

    }
}
