class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
     int[] table = new int[numCourses];

     for(int[] preq: prerequisites){
        table[preq[0]]++;
     }
     
     Queue<Integer> q = new LinkedList<>();

     for(int i = 0; i < table.length; i++){
        if(table[i] == 0){
            q.offer(i);
        }
     }

     if(q.isEmpty()){
        return false;
     }

     int completed = 0;
     while(!q.isEmpty()){
        int currCourse = q.poll();
        completed++;

        for(int[] preq: prerequisites){
            if(preq[1] == currCourse){
                table[preq[0]]--;
                if(table[preq[0]] == 0){
                    q.offer(preq[0]);
                }
            }
        }
     }
     
     return completed == numCourses;

    }
}
