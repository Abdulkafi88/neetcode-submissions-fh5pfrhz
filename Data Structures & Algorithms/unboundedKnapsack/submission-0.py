class Solution:
    def maximumProfit(self, profit: List[int], weight: List[int], capacity: int) -> int:
        n = len(profit)
        cache = {}

        def memoization(i, cap):
            if i == n:
                return 0

            if (i, cap) in cache:
                return cache[(i, cap)]
            
            skip = memoization(i + 1, cap)

            # keep choosing same profit
            new_cap = cap - weight[i]
            if new_cap >= 0:
                take = profit[i] + memoization(i, new_cap)
                cache[(i, cap)] = max(take, skip)
            else:
                cache[(i, cap)] = skip

            return cache[(i, cap)]

        return memoization(0, capacity)
        
