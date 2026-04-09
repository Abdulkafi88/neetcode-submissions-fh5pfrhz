class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> numToCount = new HashMap<>();

        for(int num: nums){
            numToCount.put(num, numToCount.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] list = new ArrayList[nums.length + 1];

        for (int i = 0; i <= nums.length; i++) {
            list[i] = new ArrayList<>();
         }

        for (Map.Entry<Integer, Integer> entry : numToCount.entrySet()) {
            int frequency = entry.getValue();
            int number = entry.getKey();
            list[frequency].add(number);
            }

        int[] result = new int[k];
        int index = 0;
        for (int i = nums.length; i >= 0 && index < k; i--) {
            if (!list[i].isEmpty()) {
                for (int num : list[i]) {
                    if (index < k) {
                        result[index++] = num;
                    }
                }
            }
        }
        return result;
    }
}
