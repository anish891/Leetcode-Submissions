public class Fizz_Buzz_Strings {
        public List<String> fizzBuzz(int n) {
            List<String> answer = new ArrayList<>();
            for(int i=1;i<=n;i++){
            answer.add(
                 i % 15 == 0 ? "FizzBuzz" :
                 i % 3 == 0 ? "Fizz" :
                 i % 5 == 0 ? "Buzz" : String.valueOf(i) );
            }
            return answer;
        }
}
