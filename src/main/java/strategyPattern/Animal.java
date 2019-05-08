package strategyPattern;

public class Animal {


    private int hight;
    private String name;
    private Flayable flayable;


    public Animal(String name, int hight,Flayable flayable){
        this.name = name;
        this.hight = hight;
        this.flayable = flayable;
    }

    public void tryFlying(){
        System.out.println(flayable.fly());
    }

}
