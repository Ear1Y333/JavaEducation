package skycapitals.text;

import static java.lang.System.*;
public class test1{
    public static void main(String[] args) {
        int [] numbers = {1, 2, 5};
        out.println(GetSum(numbers));
        GetSum("Andrey", numbers);
        out.println(GetSum(1,2,3));
        
    }
    public static int GetSum(int ...numbers){
        int sum = 0;
        for (int number : numbers){
            sum+=number;
        }
        return sum;
    }
    public static void GetSum(String name, int ...numbers){
        int sum = 0;
        for (int number : numbers){
            sum+=number;
        }
        out.printf("Hi %s, the sum is %s\n", name, sum);
    }

}
