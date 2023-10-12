import java.util.ArrayList;
import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set =  new HashSet<>();
        ArrayList<Integer> l = new ArrayList();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
            l.add(nums2[i]);
            set.remove(nums2[i]);
            }
        }
        int result[] = new int[l.size()];
        for(int i=0; i<l.size(); i++)
        {
            result[i] = l.get(i);
        }
        return result;
    }
}
