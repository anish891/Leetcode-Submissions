public class ValidParenthesesWithoutStacks {
    public boolean isValid(String s) {
        char[] c = s.toCharArray();
        int prev = -1;
        for(int i = 0; i < c.length; i++){
            if(prev < 0 || !matched(c[prev],c[i])){
                prev++;
                c[prev] = c[i];
            }else{
                prev--;
            }
        }
        return prev == -1;
    }
    static boolean matched(char c1, char c2){
        if(c1 == '(' && c2 == ')') return true;
        if(c1 == '{' && c2 == '}') return true;
        if(c1 == '[' && c2 == ']') return true;
        return false;
    }
}
