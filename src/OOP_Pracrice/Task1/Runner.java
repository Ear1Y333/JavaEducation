package OOP_Pracrice.Task1;

public class Runner {
    public static void main(String[] args) {
        Phone<String> phone1 = new Phone<>("+37529213213", "OnePlus 11R", "450");
        Phone<String> phone2 = new Phone<>("+13125565332", "OnePlus 9R");
        phone1.sendMessage("+321932719", "12837189451", "2145", "193463");
        phone1.receiveCall("Limon");
        phone1.receiveCall("Atrtem", "+1214567");

    }
}
