package lesson2.OOP.DependencyInversion;

public class runner {
    public static void main(String[] args) {
        Poodle poodle = new Poodle();
        Shepherd shepherd = new Shepherd();
        DogZoo dogZoo = new DogZoo(poodle, shepherd);

    }
}
