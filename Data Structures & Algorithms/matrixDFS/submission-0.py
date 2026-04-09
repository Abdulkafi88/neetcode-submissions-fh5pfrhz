class Solution:
    def countPaths(self, grid: List[List[int]]) -> int:
        m, n = len(grid), len(grid[0])

        def dfs(r, c, visited, m, n):
            if (min(r, c) < 0 or r == m or c == n 
                or (r,c) in visited or grid[r][c] == 1):
                return 0

            if r == m - 1 and c == n - 1:
                return 1

            visited.add((r, c))

            count = 0
            count += dfs(r + 1, c, visited, m, n)
            count += dfs(r - 1, c, visited, m, n)
            count += dfs(r, c + 1, visited, m, n)
            count += dfs(r, c - 1, visited, m, n)

            # backtrack
            visited.remove((r, c))
            return count

        count = dfs(0, 0, set(), m, n)
        return count