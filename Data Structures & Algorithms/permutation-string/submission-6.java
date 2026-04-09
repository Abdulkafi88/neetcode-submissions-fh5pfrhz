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

        int l = 0;
        int r = s1.length();
        System.out.println(r);

        while(r < s2.length()){
            if(Arrays.equals(count1, count2)){
                return true;
            }
            int index = s2.charAt(l) - 'a';
            count2[index]--;
            l++;
            index = s2.charAt(r) - 'a';
            count2[index]++;
            r++;
        }
        return Arrays.equals(count1, count2);
    }
}
