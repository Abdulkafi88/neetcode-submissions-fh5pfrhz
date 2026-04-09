class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false;
        }
        int[] count1 = new int[26];
        int[] count2 = new int[26];


        for(int i = 0; i < s1.length(); i++){
            int index1 = s1.charAt(i) - 'a';
            int index2 = s2.charAt(i) - 'a';
            count1[index1]++;
            count2[index2]++;
        }

        count2[s2.charAt(s1.length() - 1) - 'a']--;

        int l = 0;
        int r = s1.length() - 1;
        System.out.println(r);

        while(r < s2.length()){
            int index = s2.charAt(r) - 'a';
            count2[index]++;
            r++;

            if(Arrays.equals(count1, count2)){
                return true;
            }
             index = s2.charAt(l) - 'a';
            count2[index]--;
            l++;
        }
        return false;
    }
}
