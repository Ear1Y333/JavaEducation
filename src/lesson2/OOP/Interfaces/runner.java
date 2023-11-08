package lesson2.OOP.Interfaces;

public class runner {
    public static void main(String[] args) {
        fish Fish = new fish();
        duck Duck = new duck();
        plane Plane = new plane();
        canSwim[] canSwims = {Fish, Duck};
        canFly[] canFlies = {Duck, Plane};

        for(canFly bo: canFlies){
            bo.fly();
        }
        for(canSwim bu: canSwims){
            bu.swim();
        }

    }
}
