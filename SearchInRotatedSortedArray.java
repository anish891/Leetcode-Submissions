public class SearchInRotatedSortedArray {
    public int search(int[] arr, int target) {
        int si = 0;
        int ei = arr.length-1;
        return search(arr,target,si,ei);
    }
        static int search(int[] arr,int target,int si,int ei){
            if(si>ei){
            return -1;
        }
        // kaam
        int mid = si + (ei-si)/2;

        // case FOUND
        if(arr[mid] == target){
            return mid;
        }

        // mid on Line 1
        if(arr[si] <= arr[mid]){
            // case a : left 
            if(arr[si] <= target && target <= arr[mid]){
                return search(arr, target, si, mid-1);
            } else {
                // case b : right
                return search(arr, target, mid+1, ei);
            }
        }

        // mid on Line 2
        else {
            // case c : right 
            if(arr[mid] <= target && target <= arr[ei]){
                return search(arr, target, mid+1, ei);
            } else {
                // case d : left
                return search(arr, target, si, mid-1);
            }
        }
    }
}
