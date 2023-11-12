package TryCatch;

public class GetFactorial {
    public static void main(String[] args) {
        System.out.println(factorial(-15));

    }
    public static int factorial(int number){
        int result=1;
        try {
            if (number<1) throw new Exception("Число не может быть меньше 1");
            for (int i=2; i!=number; i++){
                result*=i;
            }
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
            result = 0;
        }
        return result;
    }
}


