public class ReversePrefixOfWord {
    public String reversePrefix(String word, char ch) {
        int pos = word.indexOf(ch); // Find the index of the given character
        // Check if the character exists in the word
        if (pos >= 0) {
            char c[] = word.toCharArray(); // Convert the word to a character array for manipulation
            int p1 = 0;
            int p2 = pos;
            // Reverse the substring from the beginning up to the character index
            while (p1 < p2) {
                char temp = c[p1];
                c[p1] = c[p2];
                c[p2] = temp;
                p1++;
                p2--;
            }
            word = new String(c); // Convert the character array back to a string
        }
        return word;   
    }
}
