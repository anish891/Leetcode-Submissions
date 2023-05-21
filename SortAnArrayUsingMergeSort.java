import java.util.*;
public class SortAnArrayUsingMergeSort {
    public int[] sortArray(int[] arr) {
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[] left=sortArray(Arrays.copyOfRange(arr,0,mid));
        int[]right=sortArray(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
    int[] merge(int[]first,int[]second){
        int []mix=new int[first.length+second.length];
        int i=0;
        int j=0;
        int k=0;
        while(i< first.length&&j< second.length)
        {
            if(first[i]<second[j]){
                mix[k]=first[i];
                i++;
            }
            else{
                mix[k]=second[j];
                j++;
            }
            k++;
        }
        //It may be possible that one of the array is not completed
        //copy the remaining elemnts
        while (i< first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while (j< second.length){
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;
    }
}