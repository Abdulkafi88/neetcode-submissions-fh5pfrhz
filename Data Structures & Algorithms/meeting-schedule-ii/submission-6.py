"""
Definition of Interval:
class Interval(object):
    def __init__(self, start, end):
        self.start = start
        self.end = end
"""
from typing import List

class Solution:
    def minMeetingRooms(self, intervals: List[Interval]) -> int:
        if not intervals:
            return 0

        starts = sorted([i.start for i in intervals])
        ends = sorted([i.end for i in intervals])

        used = max_used = 0
        s = e = 0

        while s < len(intervals):
            # if a task start before prev end
            if starts[s] < ends[e]:
                s += 1
                used += 1
            else:
                e += 1
                used -= 1
            
            max_used = max(max_used, used)

        return max_used