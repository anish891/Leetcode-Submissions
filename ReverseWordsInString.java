public class ReverseWordsInString {
    public String reverseWords(String s) {
        char[] str  = s.toCharArray();
        char[] res = new char[s.length()+1];
        int l =  s.length() - 1;
        int j;
        int k = 0;
        while(l>=0){
            while(l>=0 && str[l] == ' '){
                l--;
            }
            if(l<0) break;
            j = l;
            while(l>=0 && str[l]!=' '){
                l--;
            }
            for(int i = l+1;i<=j;i++){
                res[k++] = str[i];
            }
            res[k++] = ' ';
        }
        return new String(res, 0 ,k-1);
    }
}
