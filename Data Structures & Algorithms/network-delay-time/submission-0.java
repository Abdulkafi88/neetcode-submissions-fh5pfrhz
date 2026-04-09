class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer, List<int[]>> graph = new HashMap<>();


        for(int[] time: times){
            int src = time[0], target = time[1], weight = time[2];
            graph.computeIfAbsent(src, key -> new ArrayList<>()).add(new int[]{target, weight});
        }

        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));
        minHeap.add(new int[]{k, 0});

        Set<Integer> seen = new HashSet<>();

        int res = 0;

        while(!minHeap.isEmpty()){
            int[] curr = minHeap.poll();
            int src = curr[0], weight = curr[1];
            if(seen.contains(src)) continue;
            res = weight;
            seen.add(src);
            if(!graph.containsKey(src)) continue;

            for(int[] edge: graph.get(src)){
                int target = edge[0], tarWeight = edge[1];
                minHeap.add(new int[]{target, weight + tarWeight});
            }

        }
        return seen.size() == n ? res : - 1;
    }
}
