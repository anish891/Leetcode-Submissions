public class LongestWordInADictionary {
    class Node{
        Node[] children;
        boolean eow;
    
        public Node(){
            children = new Node[26];
            for(int i=0; i<26; i++){
                children[i] = null;
            }
            eow = false;
        }
    }
        Node root = new Node();
        String ans = "";
        public void insert(String word){
            Node curr = root;
            for(int i=0; i<word.length(); i++){
                int index = word.charAt(i) - 'a';
    
                if(curr.children[index] == null){
                    curr.children[index] = new Node();
                }
    
                if(i == word.length() - 1){
                    curr.children[index].eow = true;
                }
                curr = curr.children[index];
            }
        }
    
        public void helper(Node root, StringBuilder temp){
            if(root == null){
                return;
            }
    
            for(int i=0; i<26; i++){
                if(root.children[i] != null && root.children[i].eow == true){
                    temp.append((char)(i+'a'));
    
                    if(temp.length() > ans.length()){
                        ans = temp.toString();
                    }
    
                    helper(root.children[i], temp);
    
                    temp.deleteCharAt(temp.length() - 1);
                }
            }
        }
    
        public String longestWord(String[] words) {
    
            for(int i=0; i<words.length; i++){
                insert(words[i]);
            }
    
            StringBuilder sb = new StringBuilder();
    
            helper(root, sb);
    
            return ans;    
        }
}
