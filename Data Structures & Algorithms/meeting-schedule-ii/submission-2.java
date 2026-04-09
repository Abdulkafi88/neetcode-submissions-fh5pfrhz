/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        if(intervals.size() == 0){
            return 0;
        }
        int[] startingTime = new int[intervals.size()];
        int[] endingTime = new int[intervals.size()];

        for(int i = 0; i < intervals.size(); i++){
            startingTime[i] = intervals.get(i).start;
            endingTime[i] = intervals.get(i).end;
        }

        Arrays.sort(startingTime);
        Arrays.sort(endingTime);

        int maxMeetings = 0;
        int currentMeetings = 0;
        int start = 0;
        int end = 0;
        while(start < intervals.size()){
            if(startingTime[start] < endingTime[end]){
                currentMeetings++;
                maxMeetings = Math.max(maxMeetings, currentMeetings);
                start++;
            }else{
                currentMeetings--;
                end++;
            }
        }

        return maxMeetings;
    }
}
