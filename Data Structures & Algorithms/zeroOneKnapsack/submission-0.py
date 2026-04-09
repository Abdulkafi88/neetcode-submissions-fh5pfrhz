class Solution:
    def maximumProfit(self, profit: List[int], weight: List[int], capacity: int) -> int:
        # cache = (item, capacity)
        n = len(profit)
        cache = {}

        def memoization(index, cap):
            if index == n:
                return 0

            if (index, cap) in cache:
                return

            # choose to skip
            skip_choice = memoization(index + 1, cap)

            new_cap = cap - weight[index]
            if new_cap >= 0:
                take_choice = profit[index] + memoization(index + 1, new_cap)
                cache[(index, capacity)] = max(skip_choice, take_choice)
            else:
                cache[(index, capacity)] = skip_choice

            return cache[(index, capacity)]

        return memoization(0, capacity)