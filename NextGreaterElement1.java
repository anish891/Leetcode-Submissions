public class NextGreaterElement1 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] nextGreaterArr = new int[10000];
        
        for(int i = nums2.length -1; i >=0 ;i--){
            if(i+1 == nums2.length){
                nextGreaterArr[nums2[nums2.length - 1]] = -1;
                continue;
            }
            int element = nums2[i+1];
            while(nums2[i] > element && element != -1){
                element = nextGreaterArr[element];
            }
            nextGreaterArr[nums2[i]] = element;
        }
        int[] res = new int[nums1.length];
        for(int i = 0; i < nums1.length;i++){
            res[i] = nextGreaterArr[nums1[i]];
        }

        return res;
    }
}
