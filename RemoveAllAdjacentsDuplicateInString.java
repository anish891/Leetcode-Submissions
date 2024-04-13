public class RemoveAllAdjacentsDuplicateInString {
    public String removeDuplicates(String s) {
        char[] chars=s.toCharArray();
        int i = -1;
        for(char c : chars){
            if(i >= 0 && c == chars[i])
                i--;
            else
                chars[++i]= c;
            
        }
        return String.valueOf(chars, 0, ++i);
    }
}
