package skycapitals.text;

public class test1{
    public static void main(String[] args) {
        int [] Numbers = {1, 2, 5};

        System.out.println(GetSum(Numbers));
        GetSum("Andrey", Numbers);
        System.out.println(GetSum(1,2,3));
    }
    public static int GetSum(int ...numbers){
        int sum = 0;
        for (int number : numbers){
            sum+=number;
        }
        return sum;
    }
    public static void GetSum(String Name, int ...numbers){
        int sum = 0;
        for (int number : numbers){
            sum+=number;
        }
        System.out.printf("Hi %s, the sum is %s\n", Name, sum);
    }

}
