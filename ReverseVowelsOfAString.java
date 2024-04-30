public class ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        boolean[] vowels = new boolean[128];
        for(char i : "aeiouAEIOU".toCharArray()){
            vowels[i] = true;
        }
        char[] c = s.toCharArray();
        int i = 0, j = c.length-1;
        while(i<j){
            while(i<j && !vowels[c[i]]){
                i++;
            }
            while(i<j && !vowels[c[j]]){
                j--;
            }
            if(i<j){
                char temp = c[i];
                c[i] = c[j];
                c[j] = temp;
                i++;
                j--;     
               }
        }
        return String.valueOf(c);
    }
}
