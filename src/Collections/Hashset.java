package Collections;

import java.util.HashSet;

public class Hashset {

    public static void main(String[] args) {

        HashSet<String> states = new HashSet<String>();

        states.add("Germany");
        states.add("France");
        states.add("Italy");
        boolean isAdded = states.add("Germany");
        System.out.println(isAdded);

        System.out.printf("Set contains %d elements \n", states.size());

        for(String state : states){

            System.out.println(state);
        }
        states.remove("Germany");

        }
    }

