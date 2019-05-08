package strategyPattern;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Dog("Nika",34,new CantFly());

        dog.tryFlying();


    }

}
