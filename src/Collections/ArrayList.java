package Collections;

public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<String> People = new java.util.ArrayList<>();
        People.add("Tom");
        People.add("Andrey");
        People.add(1, "Bob"); //добавить элемент на место индекса i

        System.out.println(People.get(0));
        People.remove(0); //удалить элемнут с индексом i

        for(String people: People){
            System.out.println(people);
        }

        Object[] peopleArray = People.toArray();
        for(Object person : peopleArray){
            System.out.println(person);
        }
    }
}
