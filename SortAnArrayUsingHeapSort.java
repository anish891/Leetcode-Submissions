public class SortAnArrayUsingHeapSort {
    public int[] sortArray(int[] arr) {
        int n = arr.length;
               for(int i=n/2; i>=0;i--){
                   heapifyForHeapSort(arr, i, n);
               }
   
               //step-2 - push largest at end
               for(int i=n-1;i>0;i--){
                   //swap
                   int temp = arr[0];
                   arr[0] = arr[i];
                   arr[i] = temp;
   
                   heapifyForHeapSort(arr, 0, i);
               } 
               return arr;
   }
   
   
   
           public void heapifyForHeapSort(int arr[], int i, int size){
               int left = 2*i +1;
               int right = 2*i +2;
               int maxIndex = i;
   
               if(left < size && arr[left] > arr[maxIndex]){
                   maxIndex = left;
               }
   
               if(right < size && arr[right] > arr[maxIndex]){
                   maxIndex = right;
               }
   
               if(maxIndex != i){
                   int temp = arr[i];
                   arr[i] = arr[maxIndex];
                   arr[maxIndex] = temp;
   
                   heapifyForHeapSort(arr, maxIndex, size);
               }
           }
}
