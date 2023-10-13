public class WordBreak {
        static class Node{
            Node children[] = new Node[26];
            boolean ewo = false;
    
            public Node(){
                for(int i=0; i<26; i++){
                    children[i] = null;
                }
            }
        }
        public static Node root = new Node();
        public static void insert(String words){
            Node curr = root;
            for(int i=0; i<words.length(); i++){
                int idx = words.charAt(i) - 'a';
                if(curr.children[idx] == null){
                    curr.children[idx] = new Node();
                }
                curr = curr.children[idx];
            }
            curr.ewo = true;
        }
        public static boolean search(String key, int start, int end){
             Node curr = root;
            for(int i=start; i<=end; i++){
                int idx = key.charAt(i) - 'a';
                if(curr.children[idx] == null){
                    return false;
                }
                curr = curr.children[idx];
            }
            return curr.ewo == true;
        } 
        
        public boolean wordBreak(String s, List<String> wordDict) {
            root = new Node();
            for(String word: wordDict){
                insert(word);
            }  
            int n = s.length();
            boolean[] dp = new boolean[n];
    
            for(int j=0; j<n; j++){
                for(int i=0; i<=j; i++){
                    if(search(s, i, j)){
                        dp[j] = (i-1 >=0)? dp[i-1] : true;
                        if (dp[j]) break;
                    }
                } 
            }
            return dp[n-1];
        }
}
