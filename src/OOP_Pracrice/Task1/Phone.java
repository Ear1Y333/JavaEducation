package OOP_Pracrice.Task1;

public class Phone <T>{
    private T number = (T) "none";
    private T model = (T) "None";
    private T weight = (T) "500";

    public Phone(T number, T model, T weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(T number, T model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }



    public T getNumber() {
        return number;
    }

    public void receiveCall(String name){
        System.out.printf("Звонит %s\n", name);
    }
    public void receiveCall(String name, String number){
        System.out.printf("Звонит %s, номер: %s\n", name, number);
    }
    public void sendMessage(String ...number){
        for (String numberi: number) {
            System.out.println(numberi);
        }
    }
}
