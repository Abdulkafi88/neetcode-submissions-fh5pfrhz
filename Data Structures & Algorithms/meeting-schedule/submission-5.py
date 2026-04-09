"""
Definition of Interval:
class Interval(object):
    def __init__(self, start, end):
        self.start = start
        self.end = end
"""

class Solution:
    def canAttendMeetings(self, intervals: List[Interval]) -> bool:
        # if possible, then all start > previous ending
        # sort it by end, so we finish meetings early and 
        # next start might eventually be bigger
        intervals.sort(key=lambda interval:interval.start)

        for i in range(1, len(intervals)):
            if intervals[i].start < intervals[i-1].end:
                return False

        return True