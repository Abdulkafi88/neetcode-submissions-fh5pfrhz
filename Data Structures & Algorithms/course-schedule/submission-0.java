class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
     // 1 -> 0
     //  {0:0} {1:0}
     //

     int[] table = new int[numCourses];

     for(int[] preq: prerequisites){
        table[preq[0]]++;
     }
     
     Set<Integer> hs = new HashSet<>();
     for(int i = 0; i < table.length; i++){
        if(table[i] == 0){
            hs.add(i);
        }
     }
     if(hs.isEmpty()){
        return false;
     }

     while(!hs.isEmpty()){
        Iterator<Integer> it = hs.iterator();
        Integer element = it.next();
        for(int course = 0; course < prerequisites.length; course++){
            if(prerequisites[course][1] == element){
                int currCourse = prerequisites[course][0];
                table[currCourse]--;
                if(table[currCourse] == 0){
                    hs.add(currCourse);
                }
            }
        }
        hs.remove(element);
     }

     for(int num: table){
        if(num != 0){
            return false;
        }
     }

     return true;

    }
}
