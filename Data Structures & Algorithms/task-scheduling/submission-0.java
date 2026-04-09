class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] char_count = new int[26];

        for(char ch: tasks){
            char_count[ch - 'A']++;
        }

        Arrays.sort(char_count);

        int maxFreq = char_count[25] - 1;
        int idle_slots = maxFreq * n;

        for(int i = 24; i >= 0; i--){
            idle_slots -= Math.min(maxFreq, char_count[i]);
        }

        return idle_slots > 0 ? idle_slots + tasks.length : tasks.length;

    }
}
