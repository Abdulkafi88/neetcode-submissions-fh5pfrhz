from collections import defaultdict
class Solution:
    def shortestPath(self, n: int, edges: List[List[int]], src: int) -> Dict[int, int]:
        # make an adj_lst, {v:[neigbors]}
        # initialize min_heap with (src, 0)
        # populate the answer map while min_heap is non-empty
        # go through answer, if one of the vertices has no distance,
        # mark it as -1
        adj_lst = defaultdict(list)
        for u, v, w in edges:
            adj_lst[u].append((v, w))
        
        shortest = {}
        min_heap = [(0, src)]

        while min_heap:
            w, vertex = heapq.heappop(min_heap)

            # already added with shortest path from
            # src to curr vertex
            if vertex in shortest:
                continue

            shortest[vertex] = w
            for neighbor, w2 in adj_lst.get(vertex, []):
                # it will be ignored if already added by above check,
                # so dont add it
                if neighbor not in shortest:
                    heapq.heappush(min_heap, (w + w2, neighbor))
        
        for i in range(n):
            if i not in shortest:
                # no possible path from src to this vertex
                shortest[i] = -1
        return shortest