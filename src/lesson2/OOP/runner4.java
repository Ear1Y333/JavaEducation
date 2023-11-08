package lesson2.OOP;

public class runner4 {
    public static void main(String[] args) {
        Car bugatti = new Car();
        {
            bugatti.name="Bugatti";
        }
        bugatti.setMaxspeed(400);
        double time1 = bugatti.TimePer100();
        System.out.printf("Time for %s is %f\n",bugatti.getName() ,time1);


        Car ferrari = new Car();
        ferrari.setName("Ferrari");
        double time2 = ferrari.TimePer100();
        System.out.printf("Time for %s is %f",ferrari.getName() ,time2);

        garage Garage = new garage();
        Garage.setCar1(bugatti);
        Garage.setCar2(ferrari);
        Garage.ShowAllInfo();
    }
}
