"""
Definition of Interval:
class Interval(object):
    def __init__(self, start, end):
        self.start = start
        self.end = end
"""
import heapq
class Solution:
    def minMeetingRooms(self, intervals: List[Interval]) -> int:
        # sort by start to know the order of meetings
        intervals.sort(key=lambda interval:interval.start)
        min_heap = []

        # use min_heap to keep trakc of smallest end time
        # if we can fit a meeting at or before smallest
        # end, then pop and push again(use same day), else
        # add current end(we need another day)
        for interval in intervals:
            if min_heap and interval.start >= min_heap[0]:
                heapq.heappop(min_heap)

            heapq.heappush(min_heap, interval.end)

        return len(min_heap)
