"""
Definition of Interval:
class Interval(object):
    def __init__(self, start, end):
        self.start = start
        self.end = end
"""

class Solution:
    def canAttendMeetings(self, intervals: List[Interval]) -> bool:
        '''
        sort by end, having small end early help fit as many
        meetings as possible

        if no overlap, update end
        if overlap, return false
        '''
        if not intervals:
            return True
            
        intervals.sort(key=lambda interval:interval.end)
        prev_end = intervals[0].end

        for i in range(1, len(intervals)):
            curr_start = intervals[i].start

            if curr_start < prev_end:
                return False

            else:
                prev_end = intervals[i].end

        return True



