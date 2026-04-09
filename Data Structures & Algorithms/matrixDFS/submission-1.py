class Solution:
    def countPaths(self, grid: List[List[int]]) -> int:
        m, n = len(grid), len(grid[0])

        def dfs(r, c, m, n):
            if (min(r, c) < 0 or r == m or c == n 
                or grid[r][c] == 1):
                return 0

            if r == m - 1 and c == n - 1:
                return 1

            grid[r][c] = 1

            count = 0
            count += dfs(r + 1, c, m, n)
            count += dfs(r - 1, c, m, n)
            count += dfs(r, c + 1, m, n)
            count += dfs(r, c - 1, m, n)

            # backtrack
            grid[r][c] = 0
            return count

        count = dfs(0, 0, m, n)
        return count