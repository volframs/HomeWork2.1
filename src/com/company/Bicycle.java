package com.company;

public class Bicycle extends Car{

    public Bicycle (String modelName, int wheelsCount){
        super(modelName,wheelsCount);
    }


    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}


/*
class Bicycle {

    String modelName;
    int wheelsCount;

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}
*/