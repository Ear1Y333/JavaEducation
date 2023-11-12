package TryCatch;

public class Try {
    public static void main(String[] args) {

        try{
            int x = 41;
            if(x>=30){
                throw new Exception("Число х должно быть меньше 30"); //create Exception
            }
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
        System.out.println("Программа завершена");
    }
}
