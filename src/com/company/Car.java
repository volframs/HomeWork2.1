package com.company;

public class Car{

    private String modelName;
    private int wheelsCount;

    public Car(String modelName, int wheelsCount){
        this.modelName=modelName;
        this.wheelsCount=wheelsCount;
    }

    public String getModelName(){
        return modelName;
    }

    public int getWheelsCount(){
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount){
        this.wheelsCount=wheelsCount;
    }

    public void setModelName(String modelName){
        this.modelName=modelName;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}



/*
class Car extends Bicycle{

    private String modelName;
    private int wheelsCount;

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
*/