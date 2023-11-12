package TryCatch;

public class GetFactorial {
    public static void main(String[] args) {
        factorial(-15);

    }
    public static void factorial(int number){
        try {
            if (number<1) throw new Exception("Число не может быть меньше 1");
            int result=1;
            for (int i=2; i!=number; i++){
                result*=i;
            System.out.println(result);;
            }
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }
}


