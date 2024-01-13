public class MinimumNumberofStepstoMakeTwoStringsAnagram {
        public int minSteps(String s, String t) {
            int []anagram = new int[26];
            for(char ch : t.toCharArray()){
                anagram[ch-'a']++;
            }
            int ans = 0;
            for(char ch : s.toCharArray()){
                if(anagram[ch-'a']==0){
                    ans++;
                }else{
                    anagram[ch-'a']--;
                }
            }
            return ans;
        }
}
