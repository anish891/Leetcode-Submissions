public class FindTheDifference(BitManipulation) {
    public char findTheDifference(String s, String t) {
        char c = 0;
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        for(int i = 0; i<s1.length; i++){
            c ^= s1[i];
        }
        for(int i = 0; i<t1.length; i++){
            c ^= t1[i];
        }
        return c;
    }
}
