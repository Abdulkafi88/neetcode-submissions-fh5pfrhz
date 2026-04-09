class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        nums_set = set(nums)
        longest = 0

        for num in nums:
            length = 1
            while num - 1 in nums_set:
                length += 1
                num -= 1

            longest = max(longest, length)

        return longest