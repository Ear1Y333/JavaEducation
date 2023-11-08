package lesson2.OOP;

public class factorial {
    public static int recursion(int number){
        if(number<2){
            return 1;
        }
        int result=number*recursion(number-1);
        return result;
    }
}
