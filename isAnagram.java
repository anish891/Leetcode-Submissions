public class isAnagram {
        public boolean isAnagram(String s, String t) {
             if(s.length()!=t.length())return false;
            int []frq=new int[26];
            for(char ch:s.toCharArray()){
                frq[ch-'a']++;
            }
            for(char ch:t.toCharArray()){
                frq[ch-'a']--;
                if(frq[ch-'a']<0)return false;
            }
            return true;
        }
}
