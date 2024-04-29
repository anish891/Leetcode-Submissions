public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int x = flowerbed.length;
        for(int i=0;i<x;i+=2){
            if(flowerbed[i] == 0){
                if(i == x-1 || flowerbed[i] == flowerbed[i+1]){
                    n--;
                } else {
                    i++;
                }
            }
        }
        return n<=0;
    }
}
