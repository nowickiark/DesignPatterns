package factoryMethod;

public class Cat extends Animal{

    private String skinType;

    public Cat(){};

    public Cat(String hight){
        super(hight);
    }

    public Cat(String name, String hight, String skinClass) {
        super(name, hight);
        this.skinType = skinClass;
    }

    @Override
    public String toString(){
        return "Cat highTye " + getHight();
    }



}
