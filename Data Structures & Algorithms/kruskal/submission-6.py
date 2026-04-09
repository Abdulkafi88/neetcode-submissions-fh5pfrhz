
class UnionFind:
    def __init__(self, size):
        # Initialize each element as its own parent (root)
        self.parent = list(range(size))
        # Optional: Store size/rank for optimization (union by size/rank)
        self.sz = [1] * size

    def find(self, i):
        # Path compression: make every node along the path point directly to the root
        if self.parent[i] == i:
            return i
        self.parent[i] = self.find(self.parent[i])
        return self.parent[i]

    def union(self, i, j):
        # Find the representatives (roots) of both sets
        root_i = self.find(i)
        root_j = self.find(j)

        # If they are in different sets, merge them (union by size)
        if root_i != root_j:
            # Attach the smaller tree to the root of the larger tree
            if self.sz[root_i] < self.sz[root_j]:
                root_i, root_j = root_j, root_i # Swap to ensure root_i is the larger tree
            
            self.parent[root_j] = root_i
            self.sz[root_i] += self.sz[root_j]
            return True # Merged successfully
        return False # Already in the same set

class Solution:
    def minimumSpanningTree(self, n: int, edges: List[List[int]]) -> int:
        min_heap = []
        
        for n1, n2, w in edges:
            heapq.heappush(min_heap, (w, n1, n2))

        union_find = UnionFind(n)
        edges_count = 0
        total_weight = 0

        while edges_count < n - 1 and min_heap:
            w, n1, n2 = heapq.heappop(min_heap)

            # check if theres already a path from n1 to n2
            if not union_find.union(n1, n2):
                # skip because it will create a cycle otherwise
                continue

            edges_count += 1
            total_weight += w

        # mst:[[2,4], [1,3], [0,2], [1,2]]
        if edges_count < n - 1:
            return -1

        return total_weight
         