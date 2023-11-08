package lesson2.OOP.Interfaces;

public class fish implements canSwim{
    @Override
    public void swim() {
        System.out.println("Рыба может плавать");
    }
}
