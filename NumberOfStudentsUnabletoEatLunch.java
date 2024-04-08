public class NumberOfStudentsUnabletoEatLunch {
        public int countStudents(int[] students, int[] sandwiches) {
            int n = students.length;
            int m = sandwiches.length;
            Stack<Integer> stack = new Stack<>();
            for (int i = m - 1; i >= 0; i--)
                stack.push(sandwiches[i]);
            Queue<Integer> queue = new LinkedList<>();
            for (int student : students)
                queue.add(student);
            int served = 0;
    
            while(!queue.isEmpty() && served < queue.size()){
                if(stack.peek().equals(queue.peek())){
                    stack.pop();
                    queue.poll();
                    served = 0;
                } else {
                    queue.add(queue.peek());
                    queue.poll();
                    served++;
                }
            }
            return queue.size();
        }
}
