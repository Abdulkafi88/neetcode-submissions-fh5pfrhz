class Solution:
    def minimumSpanningTree(self, n: int, edges: List[List[int]]) -> int:
        '''
        Edges should be N - 1, where N is number of nodes.
        Time comp is E log V, min_heap will store E edges in worst
        case, E will always be E <= V^2, pushing and popping from min
        heap is log E, E log E is same as E log V. Space is O(E) 
        because of heap. 

        The idea is how can i connect all vertices in least expensive
        way and with no cycles? Very similar to Dijkstra's algo.
        '''
        adj_lst = defaultdict(list)
        for u, v, w in edges:
            adj_lst[u].append((v, w))
            adj_lst[v].append((u, w))


        total = 0
        visited = set()
        min_heap = [(0, 0)]  # w, node

        while min_heap:
            w, v = heapq.heappop(min_heap)

            if v in visited:
                continue

            visited.add(v)
            total += w

            for v2, w2 in adj_lst.get(v, []):
                # dont add v and already visited vertices, undirected
                if v2 not in visited:
                    heapq.heappush(min_heap, (w2, v2))

        if len(visited) == n:
            return total

        return -1

