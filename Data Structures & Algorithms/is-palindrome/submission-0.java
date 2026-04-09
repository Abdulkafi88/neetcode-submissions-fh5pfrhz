class Solution {
    public boolean isPalindrome(String s) {
        //i starts from 0
        //j starts from n - 1
        //if char at i is not digit or character i++
        //if char at j is not digit or character j--
        // otherwise compare if they are not the same return false


        int i = 0;
        int j = s.length() - 1;

        while(i <= j){
            char firstChar = s.charAt(i);
            char secondChar = s.charAt(j);
            if(!Character.isLetterOrDigit(firstChar)){
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(secondChar)){
                j--;
                continue;
            }
            if(Character.toLowerCase(firstChar) != Character.toLowerCase(secondChar)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
