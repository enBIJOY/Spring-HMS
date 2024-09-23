//package com.hms.model;
//
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//
//@Getter
//@Entity
//@NoArgsConstructor
//@AllArgsConstructor
//public class RadiologicalTest extends LabTest{
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private long Id;
//
//    public RadiologicalTest(String title,
//                            double cost,
//                            boolean isAvailable,
//                            String plateDimention){
//        this.title = title;
//        this.cost = cost;
//        this.isAvailable = isAvailable;
//    }
//
//    public String toString(){
//        String output = "Test name: "+this.title+"\n"
//                + "Cost: "+this.cost+"\n"
//                + "Availability: "+this.isAvailable+"\n";
//        return output;
//    }
//}
