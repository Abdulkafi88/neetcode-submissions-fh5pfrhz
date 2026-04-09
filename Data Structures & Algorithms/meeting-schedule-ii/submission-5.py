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

        # Step 1: Separate start and end times
        starts = sorted([i.start for i in intervals])
        ends = sorted([i.end for i in intervals])

        # Step 2: Use two pointers to sweep through times
        s, e = 0, 0
        used_rooms = 0
        max_rooms = 0

        while s < len(starts):
            if starts[s] < ends[e]:  # a meeting starts before the current one ends — overlap
                used_rooms += 1
                s += 1
            else:  # a meeting ended before or exactly when the next one starts
                used_rooms -= 1
                e += 1
            max_rooms = max(max_rooms, used_rooms)

        return max_rooms
