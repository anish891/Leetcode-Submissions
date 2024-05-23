public class FindTheDifferenceOfTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        for(int i : nums1) 
            s1.add(i);
        for(int i : nums2) 
            s2.add(i);
        List<Integer> a1 = new ArrayList<>();
        List<Integer> a2 = new ArrayList<>();
        for(int num : s1){
            if(!s2.contains(num)){
                a1.add(num);
            }
        }
        for(int num : s2){
            if(!s1.contains(num)){
                a2.add(num);
            }
        }
        List<List<Integer>> res = new ArrayList<>();
        res.add(a1);
        res.add(a2);
        return res;        
    }  
}
