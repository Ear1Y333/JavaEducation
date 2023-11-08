package Lesson1;

public class whileP {
    public static void main(String[] args) {
        int number = 0;
        while (number <= 100) {
            System.out.println(number);
            number++;
        }
        number = 0;
        do {                           // отрабатывает первое действие
            System.out.println(number);
            number++;
        } while (number < 0);

        int[] group1 = {123, 156, 114};
        int[] group2 = {134, 153, 135};
        int[][] multigroup = {group1, group2};

        for (int[] array : multigroup) {
            for (int i : array) {
                System.out.println(i);
            }
        }
    }
}





