public class ReverseWordsInString {
    public String reverseWords(String s) {
    char[] str  = s.toCharArray();  // Convert the input string to a char array
    char[] res = new char[s.length() + 1];  // Initialize a char array to store the result
    int l = s.length() - 1;  // Initialize l to the index of the last character in the input string
    int j;
    int k = 0;  // Initialize k to 0 to keep track of the current position in the result array

    // Loop through the characters of the input string from right to left
    while (l >= 0) {
        // Skip any trailing spaces in the input string
        while (l >= 0 && str[l] == ' ') {
            l--;
        }
        // If l becomes negative, it means we've reached the beginning of the string, so break out of the loop
        if (l < 0) break;
        
        // Store the end index of the current word
        j = l;
        // Move l to the beginning of the current word
        while (l >= 0 && str[l] != ' ') {
            l--;
        }
        // Copy the characters of the current word to the result array in reverse order
        for (int i = l + 1; i <= j; i++) {
            res[k++] = str[i];
        }
        // Add a space after each word in the result array
        res[k++] = ' ';
    }
    // Create a new String from the result array, excluding the trailing space
    return new String(res, 0, k - 1);
}

}
