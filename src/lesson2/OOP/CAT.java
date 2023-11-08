package lesson2.OOP;

public class CAT {
    String color;
    Double weight;
    String name;

    public CAT(String GetColor, Double GetWeight, String GetName) {
        this.color = GetColor;
        this.weight = GetWeight;
        this.name=GetName;
    }
    public void samulyaest(String ...food){
        for (String dish: food){
            System.out.printf("Сэмуля съел %s\n", dish);
        }
    }
    public String amanakui(String name){
        String output = "%s просит есть".formatted(name);
        return output;

    }
    public void hochusamulku(){
        System.out.println("Print Sam is sexy");
    }
}