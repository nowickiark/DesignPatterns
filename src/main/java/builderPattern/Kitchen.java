package builderPattern;

import javafx.util.Builder;

public class Kitchen {

    private String fridge;
    private String oven;
    private String table;

    public Kitchen(String fridge, String oven, String table) {
        this.fridge = fridge;
        this.oven = oven;
        this.table = table;
    }


    @Override
    public String toString(){
        return "Fridge - " + fridge + " Oven " + oven + " Table";
    }

    public static class KitchenBuilder{

        private String fridge;
        private String oven;
        private String table;

        public KitchenBuilder(){};

        public KitchenBuilder setFridge(String fridge) {
            this.fridge = fridge;
            return this;
        }

        public KitchenBuilder setOven(String oven) {
            this.oven = oven;
            return this;
        }

        public KitchenBuilder setTable(String table) {
            this.table = table;
            return this;
        }

        public Kitchen build(){
            return new Kitchen(fridge,oven,table);
        }


    }





}
