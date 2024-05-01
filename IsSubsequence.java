public class IsSubsequence {
        public boolean isSubsequence(String s, String t) {
        char[] m = s.toCharArray();
        char[] n = t.toCharArray();
        int i = 0;
        int cnt = 0;
        for(int j = 0; j < n.length && i< m.length; j++) {
            if(m[i] == n[j]) {
                i++;
                cnt++;
            }
        }
        return cnt == m.length;
    }
}
