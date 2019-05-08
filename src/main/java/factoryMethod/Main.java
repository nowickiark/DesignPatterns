package factoryMethod;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        FactoryHouse animalCreator = new SmallAnimalCreator();
        Scanner scan = new Scanner(System.in);
        String animalType;

        System.out.println("Let me know what Animal to create");
        animalType = scan.nextLine();

        Animal animal1 = animalCreator.createAnimal(animalType);

        System.out.println("You've created : " + animal1 );

    }

}
