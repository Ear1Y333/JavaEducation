package Collections;

import java.util.Collections;


public class LinkedList {
    public static void main(String[] args) {
        java.util.LinkedList<Integer> numbers = new java.util.LinkedList<>();
        int n = 31;
        int randMin=0, randMax=10000;
        for (int i=0; i<n;i++){
            numbers.add(randMin + (int)(Math.random()*randMax));
        }
        for (int x: numbers){
           // System.out.println(x);
        }
        int i = numbers.set(3, 30);
        System.out.println(i);
        System.out.println(numbers.getLast());
        Collections.sort(numbers);
        System.out.println(numbers.getLast());
        numbers.clear();

    }
}
