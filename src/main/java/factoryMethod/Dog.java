package factoryMethod;

public class Dog extends Animal {

    private String highType;

    public Dog(){};

    public Dog(String high){
        super(high);
    }

    public Dog(String name, String hight, String highType) {
        super(name, hight);
        this.highType = highType;
    }

    @Override
    public String toString(){
        return "Dog type " + getHight();
    }





}
