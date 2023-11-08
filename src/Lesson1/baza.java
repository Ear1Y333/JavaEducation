package Lesson1;

public class baza {
    public static void main(String[] args) {

        boolean Amanakui = true, nAmanakui=false;// 1 байт

        byte b; // 1 байт max=127, min = -128
        short a;// 2 байта max/min="+="30000
        int c1,c2;// 4 байта max/min += 2 миллиарда
        long x=9000000000000000000L;// 8 байт max/min =  +-9000000000000000000

        System.out.println(x/2);

        float m = 0.12345678F; //4 byte
        double k = 0.1234567891123456;//8 byte
        System.out.println(m+k);

        c1=10;
        c2=3;
        double delenie = (double) c1 / c2;
        System.out.println((double)c1/c2);


        char artem = 'a';// 2 байта
        System.out.println(artem);



        int x1=4,x2=5;

        if (x1>x2){
            System.out.println("X1 > X2");
        }
        else if(x1==x2){
            System.out.println("X1=X2");
        }
        else{
            System.out.println("X1<x2");
        }

        //          "&&"==and       "||"==or         "!"->not
    }
}
