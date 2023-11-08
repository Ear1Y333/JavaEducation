package Lesson1;

public class Array {
    public static void main(String[] args) {
        int artem = 2, masska = 3;
        int[] array = {artem, masska};
        //array[0]=artem;
        //array[1]=masska;
        System.out.println(array[0]);
        System.out.println(array);//ссылка на обьект


        char [] MyLove = {'A', 'l', 'e', 's', 'i', 'a'};
        System.out.print("I love ");

        for (char answer: MyLove){

            System.out.print(answer);
        }

        System.out.print('\n');

        for (int i=0; i<5; i++) {
            System.out.print(MyLove[i]);
        }

    }
}
