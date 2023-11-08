package Lesson1;

public class string_format {
    public static void main(String[] args) {
        String name1 = "Artem", name2 = "Mashka";
        int number1=100, number2=0;
        String amanakui1 = String.format("%s love %s on a %d procents", name1,name2,number1);
        String amanakui2 = "%s love %s on a %d procents".formatted(name1,name2,number1);
        System.out.println(amanakui1);
        System.out.println(amanakui2);;
        System.out.printf("But %s only on %d procents\n", name2, number2);




        boolean isWannapeaches = false;
        String amanakui3 = "Я %s хочу персики".formatted(isWannapeaches? "очень" : "не");
        System.out.println(amanakui3);
    }
}

