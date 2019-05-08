package factoryMethod;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

public class BigAnimalCreator implements FactoryHouse {

    private Map<String,Animal> animals = new HashMap<String, Animal>();

    public BigAnimalCreator(){
        animals.put("Dog", new Dog("Big"));
        animals.put("Cat", new Cat("Big"));
    }


    @Override
    public Animal createAnimal(String name) {
        Animal animal = null;

        animal = animals.get(name);

        return animal;
    }
}
