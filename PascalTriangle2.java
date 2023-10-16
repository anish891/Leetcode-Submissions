public class PascalTriangle2 {
        public List<Integer> getRow(int rowIndex) {
            List<Integer> res = new ArrayList<>();
            res.add(1);
            long x = 1;
            for (int i = 1; i <= rowIndex; i++) {
                long next_val = x * (rowIndex - i + 1) / i;
                res.add((int) next_val);
                x = next_val;
            }
            return res;
        }
}
