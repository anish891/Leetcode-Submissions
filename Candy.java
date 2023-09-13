public class Candy {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] candies = new int [n];
        // First Pass
        for(int i=1;i<n;i++){
            if(ratings[i-1] < ratings[i] && candies[i-1] >= candies[i]){
                candies[i] = candies[i-1] + 1;
            }
        }
        // Second Pass
        for(int i = n-2;i>=0;i--){
            if(ratings[i+1] < ratings[i] && candies[i+1] >= candies[i]){
                candies[i] = candies[i+1] + 1;
            }
        }

        int totalCountOfCandies = 0;

        for(int i=0;i<n;i++){
            totalCountOfCandies += candies[i] + 1;
        }

        return totalCountOfCandies;
    }
}
