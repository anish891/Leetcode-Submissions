public class StringCompression {
    public int compress(char[] chars) {
        int j =0;
        int i =0;
        while(i<chars.length){
            char x = chars[i];
            int count = 0;
            while(i<chars.length && chars[i] == x){
                count++;
                i++;
            }
            chars[j++] = x;
            if(count > 1){
                String countStr = String.valueOf(count);
            for (int k = 0; k < countStr.length(); k++) {
                chars[j++] = countStr.charAt(k);
            }   
          }
        }
        return j;
    }
}
