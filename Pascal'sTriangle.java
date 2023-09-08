public class Pascal'sTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        for(int i=1;i<=numRows;i++) {
            l1 = rowGen(i);
            result.add(l1);
        }
        return result;
    }
    public static List<Integer> rowGen(int r) {
        List<Integer> rowList = new ArrayList<>();
        int ans = 1;
        rowList.add(1);
        for(int i=1;i<r;i++) {
            ans = ans*(r-i);
            ans = ans/i;
            rowList.add(ans);
        }
        return rowList;
    }
}
