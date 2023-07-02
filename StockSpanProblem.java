import java.util.Stack;
public class StockSpanProblem {
    Stack<int[]> stk;
    public StockSpanner() {
        stk = new Stack<>();
    }
    public int next(int price) {
        int i = 1;
        while(!stk.isEmpty() && stk.peek()[1]<=price){
            i +=stk.pop()[0];
        }
        stk.push(new int[]{i,price});
        return i;
    }
}
