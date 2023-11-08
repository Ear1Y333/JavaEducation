package lesson2.OOP;

public class runner1 {
    public static void main(String[] args) {
        CAT sam = new CAT("Brown", 8.0, "Sam");
        System.out.println(sam.color);
        String retard = sam.amanakui("Сэм");
        System.out.println(retard);
        sam.samulyaest("рыбу", "корм", "медведя");
        sam.hochusamulku();
    }
}
