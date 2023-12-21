import java.util.Arrays;

public class WidestVerticalAreaBetweenTwoPointsContainingNoPoints {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] list = new int[points.length];
        for (int i=0; i<points.length;i++){
            list[i]=points[i][0];
        }
        Arrays.sort(list);
        int max = Integer.MIN_VALUE;
        for (int i=list.length-1; i>0;i--){
            if ((list[i]-list[i-1])>max){
                max=list[i]-list[i-1];
            }
        }
        return max;
    }
}
