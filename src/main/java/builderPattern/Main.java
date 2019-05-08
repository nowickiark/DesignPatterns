package builderPattern;

public class Main {

    public static void main(String[] args) {

        Kitchen kitchen = new Kitchen.
                KitchenBuilder().
                setFridge("Cooler").
                setOven("Heater").
                setTable("Stady").build();

        System.out.println(kitchen);


        SingleKitchen single = SingleKitchen.getInstance(11);

        System.out.println(single);



    }


}
