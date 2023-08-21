public class RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        
        //abcabcabc
        for(int i = len / 2; i > 0; i--){
            if(len % i == 0 && s.charAt(i - 1) == s.charAt(len - 1)){
                String ss = s.substring(0, i);
                int repeat = len / i;
                if(ss.repeat(repeat).equals(s)){
                    return true;
                }
            }
        }
        return false;
    }
}
