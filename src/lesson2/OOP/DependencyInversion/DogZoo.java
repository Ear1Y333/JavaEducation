package lesson2.OOP.DependencyInversion;

public class DogZoo {
    //aka pitomnik
    private Dog dog1;
    private Dog dog2;

    public DogZoo(Dog dog1, Dog dog2) {
        this.dog1 = dog1;
        this.dog2 = dog2;
    }
    public DogZoo(Poodle poodle, Shepherd shepherd) {
        this.dog1 = poodle;
        this.dog2 = shepherd;
    }
}

