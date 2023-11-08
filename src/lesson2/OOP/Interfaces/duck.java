package lesson2.OOP.Interfaces;

public class duck implements canFly, canSwim{

    @Override
    public void fly() {
        System.out.println("Утка может летать");
    }

    @Override
    public void swim() {
        System.out.println("Утка может плавать");
    }
}
