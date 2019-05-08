package factoryMethod;

public abstract class Animal {

    private String name;
    private String hight;

    public Animal(){};

    public Animal(String hight){
        this.hight = hight;
    }

    public Animal(String name, String  hight){
        this.name = name;
        this.hight = hight;
    }

    public String getHight(){
        return hight;
    }






}
