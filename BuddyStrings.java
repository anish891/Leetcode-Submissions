public class BuddyStrings {
        public boolean buddyStrings(String s, String goal) {
            if(s == null || goal == null || s.length() != goal.length() || s.length() < 2){
                return false;
            }
            if(s.equals(goal)){
                int[] map = new int[26];
                for(int i = 0; i < s.length(); i++){
                    if(map[s.charAt(i) - 'a'] == 1){
                        return true;
                    }else{
                        map[s.charAt(i) - 'a'] = 1;
                    }
                }
            }
            char[] s1 = s.toCharArray();
            char[] s2 = goal.toCharArray();
            char s1_1 = '1', s1_2 = '2', s2_1 = '3', s2_2 = '4';
            boolean found1stDiff = false;
            boolean found2ndDiff = false;
    
            for(int i = 0; i < s1.length; i++){
                if(s1[i] != s2[i]){
                    if(!found1stDiff){
                        found1stDiff = true;
                        s1_1 = s1[i];
                        s2_1 = s2[i];
                    }else if(!found2ndDiff){
                        found2ndDiff = true;
                        s1_2 = s1[i];
                        s2_2 = s2[i];
                        if(s1_2 != s2_1 || s1_1 != s2_2){
                            return false;
                        }
                    }else{
                        return false;
                    }
                }
            }
            return found1stDiff && found2ndDiff;
        }
}
