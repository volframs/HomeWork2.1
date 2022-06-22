package com.company;

import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {

        /*Car[] car = {
                new Car("car1",4),
                new Car("car2",4),
        };*/


        Bicycle[] bicycle ={
                new Bicycle("bicycle1",2),
                new Bicycle("bicycle2",2),
        };

        Truck[] truck ={
                new Truck("Truck1",6),
                new Truck("Truck2",8),
        };


        ServiceStationForSerSt serviceStation = new ServiceStation();
        ServiceStationForSerSt serviceStationFor = new ServiceStationFor();

        serviceStationFor.print(bicycle);
        serviceStation.print(bicycle);
        serviceStationFor.print(truck);
        serviceStation.print(truck);
        //serviceStation.print(car);

        Car[] machine = new Car[bicycle.length+ truck.length];
        for (int i = 0; i < bicycle.length; i++) {
            machine[i] = bicycle[i];
        }
        for (int i = 0; i < truck.length; i++) {
            machine[i + bicycle.length] = truck[i];
        }

        printReport(serviceStation, machine, bicycle, truck);
        printReport(serviceStationFor, machine, bicycle, truck);

        /*ServiceStation station = new ServiceStation();
        station.check(car, null, null);
        station.check(car2, null, null);
        station.check(null, bicycle, null);
        station.check(null, bicycle2, null);
        station.check(null, null, truck);
        station.check(null, null, truck2);*/
    }

    private static void printReport(ServiceStationForSerSt serviceStationForSerSt, Car[] machine, Bicycle[] bicycle, Truck[] truck){
        serviceStationForSerSt.print(machine);
        serviceStationForSerSt.print(bicycle);
        serviceStationForSerSt.print(truck);

    }

}




/*
package com.company;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = new Car();
        car.modelName = "car1";
        car2.modelName = "car2";
        car.wheelsCount = 4;
        car2.wheelsCount = 4;

        Truck truck = new Truck();
        Truck truck2 = new Truck();
        truck.modelName = "truck1";
        truck2.modelName = "truck2";
        truck.wheelsCount = 6;
        truck2.wheelsCount = 8;

        Bicycle bicycle = new Bicycle();
        Bicycle bicycle2 = new Bicycle();
        bicycle.modelName = "bicycle1";
        bicycle2.modelName = "bicycle2";
        bicycle.wheelsCount = 2;
        bicycle2.wheelsCount = 2;

        ServiceStation station = new ServiceStation();
        station.check(car, null, null);
        station.check(car2, null, null);
        station.check(null, bicycle, null);
        station.check(null, bicycle2, null);
        station.check(null, null, truck);
        station.check(null, null, truck2);
    }
}

*/