package factoryMethod;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

public class SmallAnimalCreator implements FactoryHouse {

    private Map<String,Animal> animals = new HashMap<String, Animal>();

    public SmallAnimalCreator(){
        animals.put("Dog", new Dog("Small"));
        animals.put("Cat", new Cat("Small"));
    }


    @Override
    public Animal createAnimal(String name) {
        Animal animal = null;

        animal = animals.get(name);

        return animal;
    }
}
