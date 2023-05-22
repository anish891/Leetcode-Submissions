public class ContainerWithMostWater {
        public int maxArea(int[] height) {
            // 2 pointer approach   -  O(n)
            int maxWater = 0;
            int lp =0;
            int rp = height.length-1;
    
            while(lp < rp){
                //calculate water area
                int ht = Math.min(height[lp], height[rp]);
                int width = rp-lp;
                int currWater = ht * width;
                maxWater = Math.max(maxWater, currWater);
    
                // update pointer
                if(height[lp] < height[rp]){
                    lp++;
                } else {
                    rp--;
                }
            }
            return maxWater;
        }
}
