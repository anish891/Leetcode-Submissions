import java.util.Arrays;
import java.util.Comparator;

public class MaximumLengthofPairChain {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int chainLength = 1;
        int chainEnd = pairs[0][1];  //Last selected pair end //chain end

        for(int i=1; i<pairs.length; i++){
            if(pairs[i][0] > chainEnd) {
                chainLength++;
                chainEnd = pairs[i][1];
            }
        }
        return chainLength;
    }
}
