package lesson2.OOP;

public class restaurant {
    static private int sosageCount = 0, breadCount = 0;

    public void GetIngridients() {
        sosageCount+=100;
        breadCount+=200;
    }

    public void GetDish() {
        if (sosageCount >= 1 && breadCount >= 1) {
            sosageCount--;
            breadCount -= 2;
            System.out.println("Дело сделано");
        } else {
            System.out.println("Не хватает ингридиентов");
        }

    }
}
