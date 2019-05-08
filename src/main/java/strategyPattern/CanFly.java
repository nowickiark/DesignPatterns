package strategyPattern;

public class CanFly implements Flayable {

    public CanFly(){};

    @Override
    public String fly() {
        return "I can fly!";
    }


}
