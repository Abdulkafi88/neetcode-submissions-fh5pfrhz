class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] table = new int[numCourses];

        for(int[] preq: prerequisites){
            table[preq[0]]++;
        }

        Queue<Integer> q = new LinkedList<>();

        for(int course = 0; course < table.length; course++){
            if(table[course] == 0){
                q.offer(course);
            }
        }
        if(q.isEmpty()){
            return new int[]{};
        }

        int[] res = new int[numCourses];
        int completed = 0;
        while(!q.isEmpty()){
            int currCourse = q.poll();
            System.out.println(currCourse);
            completed++;
            res[completed-1] = currCourse;
            for(int[] preq: prerequisites){
                if(preq[1] == currCourse){
                    table[preq[0]]--;
                    if(table[preq[0]] == 0){
                        q.offer(preq[0]);
                    }
                }
            }
        }

        return completed == numCourses ? res : new int[]{};
    }
}
