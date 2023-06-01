public class SummaryRanges {
        int findEnd (int[] nums, int l, int h, int start) {
            if(l>h) 
                return -1;
            int mid = (l+h)/2;
            if(nums[mid]-nums[start] == mid-start) {  //number is part if current range
                int ind = findEnd(nums, mid+1, h, start);  // check if any further numbers belong to current range
                return ind == -1 ? mid : ind;  // if no further numbers belong to range then return mid else return the further end
            }
            return findEnd(nums,l,mid-1,start);  //if mid is not part of range then the end must exist in left subarray
        }
        
        public List<String> summaryRanges(int[] nums) {
            List<String> ans = new ArrayList<>();
            
            if(nums.length == 0) return ans;
            
            StringBuffer str = new StringBuffer("");
            int start = 0;
            while(start<nums.length) {
                if(str.length() > 0)
                    str.delete(0,str.length());
                str.append(nums[start]);
                int end = findEnd(nums, start, nums.length-1, start);  //find end index for every range from start
                if(start!=end) {
                    str.append("->");
                    str.append(nums[end]);
                }
                ans.add(str.toString());
                start=end+1;  //new range will begin at index after previous range end
            }
            return ans;
    }
}
