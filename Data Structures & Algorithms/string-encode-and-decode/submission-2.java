class Solution {

    public String encode(List<String> strs) {
        StringBuilder builder = new StringBuilder();

        for(String word: strs){
            builder.append(word.length()).append("#").append(word);
        }

        return builder.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j)); // from i to before '#'

            String word = str.substring(j + 1, j + 1 + length);
            result.add(word);

            i = j + 1 + length;
        }

        return result;
    }
}
