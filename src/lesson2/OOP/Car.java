package lesson2.OOP;

public class Car {
    String name;
    private int maxspeed = 220;

    static int number=0;
    public void setName(String name) {
        this.name = name;
    }
    {
        number +=1;
        System.out.println(number);
    }
    public void setMaxspeed(int maxspeed) {
        this.maxspeed = maxspeed;
    }

    public String getName() {
        return name;
    }

    public int getMaxspeed() {
        return maxspeed;
    }

    public double TimePer100(){
        return 110d/(this.maxspeed/20d);
    }
}
