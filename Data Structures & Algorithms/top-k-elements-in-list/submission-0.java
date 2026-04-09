class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> storeMap = new HashMap<>();
        int[] result = new int[k];


        for(int number : nums){
            storeMap.put(number, storeMap.getOrDefault(number, 0) + 1);
        }

        //Grabing the Map and turning it into a sortable List
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(storeMap.entrySet());

        //Sort the number     
        entryList.sort((a, b) -> b.getValue() - a.getValue());
    

        for(int i = 0; i < k; i++){
            result[i] = entryList.get(i).getKey();
        }


        return result;
    
    }
}
