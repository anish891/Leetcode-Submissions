public class LargestPositiveIntegerThatExistsWithItsNegativeValue {
    public int findMaxK(int[] nums) {
        boolean[] negative = new boolean[1001];
        for (int i: nums)
            if (i < 0) negative[-i] = true;

        int answer = -1;
        for (int i : nums)
            if (i > answer && negative[i])
                answer = i;
        return answer;
    }
}
