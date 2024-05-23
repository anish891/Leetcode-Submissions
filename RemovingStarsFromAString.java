public class RemovingStarsFromAString {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        int n = s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i) != '*'){
                stack.add(s.charAt(i));
            }else{
                if(stack.size() > 0) stack.pop();
            }
        }
        StringBuilder res = new StringBuilder();
        while(stack.size() > 0){
            res.append(stack.pop());
        }
        return res.reverse().toString();
    }
}
