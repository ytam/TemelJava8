package io.github.ytam.OOP1;

/**
 * Created by brusk on 12/9/16.
 */
public class Car {

    private int doors;
    private int wheels;
    private String  model;
    private String  engine;
    private String  colour;


    public void setModel(String model){

        String validModel =model.toLowerCase();

        if(validModel.equals("Porcshe")){
            this.model=model;

        }
        else {
            this.model = "Unknown";

        }

    }

    public String getModel() {
        return model;
    }

}
