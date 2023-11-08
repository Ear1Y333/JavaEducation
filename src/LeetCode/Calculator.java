package LeetCode;

public class Calculator {
    public static void main(String[] args) {
        int num = 38;
        System.out.println(calculate(num));
    }

   protected static int calculate(int number) {
       String numberstr= Integer.toString(number);
       int sum=0;
       String[] new_array = numberstr.split("");
       for(String i : new_array) {
           sum += Integer.parseInt(i);
       }
       if (sum>9){
           return calculate(sum);
       }
       return sum;

   }
}
