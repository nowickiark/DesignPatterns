package builderPattern;

public class SingleKitchen {

    private static SingleKitchen kitchenInstance;
    private int kitchenSize;

    private SingleKitchen(int kitchenSize){
        this.kitchenSize = kitchenSize;
    }

    public static SingleKitchen getInstance(int size){

        if(kitchenInstance == null){
            kitchenInstance = new SingleKitchen(size);
        }

        return kitchenInstance;
    }

    @Override
    public String toString(){
        return "Size of this table is " + kitchenSize;
    }



}
