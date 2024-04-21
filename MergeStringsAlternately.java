public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder str = new StringBuilder("");
        int maxLength = Math.max(word1.length(),word2.length());
        for(int i=0;i<maxLength;i++){
            if (i < word1.length()) {
            str.append(word1.charAt(i));
            }
            if (i < word2.length()) {
            str.append(word2.charAt(i));
            }
        }
        return str.toString();
    }
}
