package Collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class Iter {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        ListIterator<String> names_i = names.listIterator();
        names.add("Andrey");
        names.add("Alesia");
        names.add("Artem");
        names.add("Vanya");
        while(names_i.hasNext()){
            System.out.println(names_i.next());
        }
    }
}
