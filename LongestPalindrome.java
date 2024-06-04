public class LongestPalindrome {
        public int longestPalindrome(String s) {
            HashSet<Character> set = new HashSet<>();
            int ans = 0;
            for(char c : s.toCharArray()){
                if(set.contains(c)){
                    set.remove(c);
                    ans += 2;
                } else{
                    set.add(c);
                }
            }
            if(!set.isEmpty()){
                ans += 1;
            }
            return ans;
        }
}
