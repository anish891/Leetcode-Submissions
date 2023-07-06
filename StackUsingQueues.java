public class StackUsingQueues {
    class MyStack {
        /** Initialize your data structure here. */
        Queue <Integer> q1;
        Queue <Integer> q2;
        public MyStack() {
            q1=new LinkedList<>();
            q2=new LinkedList<>();        
        }
        
        /** Push element x onto stack. */
        public void push(int x) {
            while(q1.peek()!=null)
            {
                q2.offer(q1.poll());    
            }
            q1.offer(x);
            while(q2.peek()!=null)
            {
                q1.offer(q2.poll());    
            }
        }
        
        /** Removes the element on top of the stack and returns that element. */
        public int pop() {
            return q1.poll();        
        }
        
        /** Get the top element. */
        public int top() {
            return q1.peek();
        }
        
        /** Returns whether the stack is empty. */
        public boolean empty() {
            if(q1.peek()==null)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
}
