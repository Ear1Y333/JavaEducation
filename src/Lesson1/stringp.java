package Lesson1;

public class stringp {
    public static void main(String[] args) {
        String text1 = new String("amanakui");//ссылочный тип данных
        String text2 = new String("amanakui");

        //но если сравнить без equal будет false потому что они буду указывать на разные блоки памяти из-за new String
        System.out.println(text1.equals(text2));
        String text3 = "amanakui";
        String text4 = "amanakui";
        System.out.println(text3 == text4);

        String text = "Sam and Rox";
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
        System.out.println(text.contains("caban"));
        System.out.println(text.length());
        System.out.println(text.replaceAll("R", "B"));
        System.out.println(text.repeat(10));

        String[] new_array = text.split(" ");
        System.out.println(new_array[0]);

        System.out.println(text.substring(8, 11));

        String Alesia = "I want a peach(, and I love my boyfriend";
        System.out.print(Alesia.substring(10, Alesia.length()).toLowerCase());
        System.out.print("\n");
        String[] SplitedAlesia = Alesia.split(" ");

        for (String word : SplitedAlesia) {
            System.out.println(word);

        }
    }
}