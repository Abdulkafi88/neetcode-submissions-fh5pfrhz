from collections import defaultdict
class Solution:
    def topologicalSort(self, n: int, edges: List[List[int]]) -> List[int]:
        '''
        adj_lst = {2:[3], 3:[1], 4:[0, 1], 5:[0, 2]}
        ex1: 2 -> 3, 3 -> 1, 4 -> 0, 4 -> 1, 5 -> 0, 5 -> 2.
        u -> v, where u comes before v.
        valid = [5, 4, 2, 3, 1, 0],
        visit_state = [2, 2, 2, 2, 2, 2]
        top_sort = [1, 3, 2, 0, 4, 5]
        [5, 4, 0, 2, 3, 1]

        ex2: 0 -> 1, 1 -> 2, 2 -> 0
        adj_lst = {0:[1], 1:[2], 2:[0]}
        [], not valid.
        visit_state = [1, 1, 1]

        approach: postorder dfs, populate top_sort array,
        use visit_state to keep track of visiting state,
        if cycle detected, return [], else, sort top_sort
        then return
        '''
        adj_lst = defaultdict(list)
        visit_state = [0] * n

        for u, v in edges:
            adj_lst[u].append(v)

        top_sort = []
        for i in range(n):
            if not self.dfs(i, adj_lst, top_sort, visit_state):
                return []

        top_sort.reverse()
        return top_sort



    def dfs(self, i, adj_lst, top_sort, visit_state) -> bool:
        if visit_state[i] == 1:
            return False

        if visit_state[i] == 2:
            return True

        visit_state[i] = 1
        for neighbor in adj_lst.get(i, []):
            if not self.dfs(neighbor, adj_lst, top_sort, visit_state):
                return False

        visit_state[i] = 2
        top_sort.append(i)
        return True