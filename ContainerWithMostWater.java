public class ContainerWithMostWater {
        public int maxArea(int[] height) {

        //optimised approach 
        int l = 0;
        int r = height.length - 1;
        int left = 0;
        int right = 0;
        int h = 0;
        int ans = 0;
        while(l < r){
            left = height[l];
            right = height[r];
            h = Math.min(left, right);
            ans = Math.max(ans, h * (r -l));
            while(l < r && height[l] <= h) l++;
            while(l < r && height[r] <= h) r--;
        }
        return ans;



                
            // // 2 pointer approach   -  O(n)
            // int maxWater = 0;
            // int lp =0;
            // int rp = height.length-1;
    
            // while(lp < rp){
            //     //calculate water area
            //     int ht = Math.min(height[lp], height[rp]);
            //     int width = rp-lp;
            //     int currWater = ht * width;
            //     maxWater = Math.max(maxWater, currWater);
    
            //     // update pointer
            //     if(height[lp] < height[rp]){
            //         lp++;
            //     } else {
            //         rp--;
            //     }
            // }
            // return maxWater;
        }
}
