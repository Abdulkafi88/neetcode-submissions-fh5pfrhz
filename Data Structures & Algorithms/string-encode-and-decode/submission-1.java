class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String newStr : strs){
            int strLength = newStr.length();

            sb.append(strLength).append("#").append(newStr);
            
        }
        return sb.toString();
    }

    public List<String> decode(String str) {

        List<String> strResult = new ArrayList<>();

        int index = 0;
        // While the string is grater than the index 0
        while (index < str.length()){
            // string before the #
            String lengthStr = "";

            // Loop until you see #
            while(str.charAt(index) != '#'){
                // Each time add the current str[i] to the lengthStr
                lengthStr += str.charAt(index);
                // increament the index to move to the next string
                index++;
            }
            // Parse the lengthStr into an integer
            int wordLength = Integer.parseInt(lengthStr);

            //Skip the #
            index++;

            // Read exactly wordLength characters
            String word = str.substring(index, index + wordLength);

            //Add word to the result 
            strResult.add(word);

            index = index + wordLength;
        }

        return strResult; 
    }
}
