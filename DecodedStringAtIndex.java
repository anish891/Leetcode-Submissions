public class DecodedStringAtIndex {
        public String decodeAtIndex(String s, int k) {
            int prev = 0, temp = 0;
            for(int i = 0; i < s.length(); i++){
                if(Character.isDigit(s.charAt(i))) {
                    temp = prev;
                    prev *= (s.charAt(i) - '0');
                    if(k <= prev || temp > prev){ // overflow, temp > prev
                        if(!(k % temp == 0) || temp > prev) k %= temp;
                        else if(k < temp) k = 1;
                        else k = temp;
                        i = -1; prev = 0;
                    }
                }
                else if(k == (++prev))
                    return String.valueOf(s.charAt(i));
            }
            return "";
        }
}
