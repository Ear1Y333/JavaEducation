package lesson2.OOP;

public class garage {
    private Car car1, car2;

    public void setCar1(Car car1) {
        this.car1 = car1;
    }

    public void setCar2(Car car2) {
        this.car2 = car2;
    }

    public void ShowAllInfo() {
        garage.ShowInfo(car1);
        garage.ShowInfo(car2);

    }

    private static void ShowInfo(Car car){
        System.out.printf("\nName is: %s, maxspeed is: %d", car.getName(), car.getMaxspeed());
    }
}
