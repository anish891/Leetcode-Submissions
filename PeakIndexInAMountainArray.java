public class PeakIndexInAMountainArray {
        public int peakIndexInMountainArray(int[] arr) {
            int n=arr.length;
            int start=0,end=n-1;int ans=-1;
            while(start<end){
                int mid= (start+end)/2;
                if(arr[mid]<arr[mid+1]) start=mid+1;
                else end=mid;
            }
            return start;
        }
}
