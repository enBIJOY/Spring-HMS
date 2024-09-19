package com.hms.model;

public class RadiologicalTest extends LabTest{

    private String plateDimention;

    public RadiologicalTest(String title,
                            double cost,
                            boolean isAvailable,
                            String plateDimention){
        this.title = title;
        this.cost = cost;
        this.isAvailable = isAvailable;
        this.plateDimention = plateDimention;
    }

    public String toString(){
        String output = "Test name: "+this.title+"\n"
                + "Cost: "+this.cost+"\n"
                + "Plate Dimention: "+this.plateDimention+"\n"
                + "Availability: "+this.isAvailable+"\n";
        return output;
    }
}
