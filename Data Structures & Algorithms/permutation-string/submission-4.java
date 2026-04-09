class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false;
        }
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for(int i = 0; i < s1.length(); i++){
            map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i), 0) + 1);
            map2.put(s2.charAt(i), map2.getOrDefault(s2.charAt(i), 0) + 1);
        }
                System.out.println(map2);

        map2.put(s2.charAt(s1.length() - 1), map2.getOrDefault(s2.charAt(s1.length() - 1), 0) - 1);
        System.out.println(map2);
        int r = s1.length() - 1;
        int l = 0;

        int window = s1.length();

        while(r < s2.length()){
            map2.put(s2.charAt(r), map2.getOrDefault(s2.charAt(r), 0) + 1);
            r++;
            boolean valid = true;
            for(char ch: s1.toCharArray()){
                if(map1.get(ch) != map2.get(ch)){
                    valid = false;
                    break;
                }
            }
            if(!valid){
                map2.put(s2.charAt(l), map2.getOrDefault(s2.charAt(l), 0) - 1);
                l++;

            }else{
                return true;
            }
            

        }
        return false;
    }
}
