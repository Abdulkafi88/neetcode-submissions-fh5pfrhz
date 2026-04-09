"""
Definition of Interval:
class Interval(object):
    def __init__(self, start, end):
        self.start = start
        self.end = end
"""

class Solution:
    def canAttendMeetings(self, intervals: List[Interval]) -> bool:
        # iterate through all intervals,
        # compare the current_start with the last_end
        # if current_start < last_end, its a conflict
        # return false
        intervals.sort(key=lambda interval: interval.start)
        for i in range(1, len(intervals)):
            current_start = intervals[i].start
            last_end = intervals[i - 1].end
            if current_start < last_end:
                return False

        return True