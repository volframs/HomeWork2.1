package com.company;

public class ServiceStationFor implements ServiceStationForSerSt {
    /*@Override
    public void print(Car[] car) {
        System.out.println("list's size all transport= " + car.length);
        System.out.print("Car:  ");
        printMachine(car);
        System.out.println();
    }*/


    @Override
    public void print(Bicycle[] bicycle) {
        System.out.println("list's size bicycle =" + bicycle.length);
        System.out.print("Bicycle:  ");
        printMachine(bicycle);
        System.out.println();
    }

    @Override
    public void print(Truck[] trucks) {
        System.out.println("list's size trucks =" + trucks.length);
        System.out.print("Trucks:  ");
        printMachine(trucks);
        System.out.println();
    }

    private void printMachine (Car[] car){
        for (int i = 0; i < car.length; i++) {
            Car machine = car[i];
            System.out.println("Name of model " + machine.getModelName()
                    + ";wheels " + machine.getWheelsCount());
        }
        System.out.println();
    }

}
