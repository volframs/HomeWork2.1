
package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class ServiceStation implements ServiceStationForSerSt {
    @Override
    public void print(Car[] car) {
        System.out.println("list's size car= " + car.length);
        for (int i = 0; i < car.length; i++) {
            Car machine = car[i];
            System.out.println("Name of model " + machine.getModelName()
                    + ";wheels " + machine.getWheelsCount());
        }
        System.out.println();
    }


    @Override
    public void print(Bicycle[] bicycle) {
            System.out.println("list's size bicycle =" + bicycle.length);
            for (int i = 0; i < bicycle.length; i++) {
                Bicycle bicycles = bicycle[i];
                System.out.println("Name of model " + bicycles.getModelName()
                        + ";wheels " + bicycles.getWheelsCount());
            }
            System.out.println();
    }

    @Override
    public void print(Truck[] trucks) {
        System.out.println("list's size trucks =" + trucks.length);
        for (int i = 0; i < trucks.length; i++) {
            Truck truck = trucks[i];
            System.out.println("Name of model " + truck.getModelName()
                    + ";wheels " + truck.getWheelsCount());
        }
        System.out.println();
    }


    /*public void check(Car car, Bicycle bicycle, Truck truck) {
        if (car != null) {
            System.out.println("Обслуживаем " + car.modelName);
            for (int i = 0; i < car.wheelsCount; i++) {
                car.updateTyre();
            }
            car.checkEngine();
        } else if (truck != null) {
            System.out.println("Обслуживаем " + truck.modelName);
            for (int i = 0; i < truck.wheelsCount; i++) {
                truck.updateTyre();
            }
            truck.checkEngine();
            truck.checkTrailer();
        } else if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.modelName);
            for (int i = 0; i < bicycle.wheelsCount; i++) {
                bicycle.updateTyre();
            }
        }
    }*/
}


/*
class ServiceStation {
    public void check(Car car, Bicycle bicycle, Truck truck) {
        if (car != null) {
            System.out.println("Обслуживаем " + car.modelName);
            for (int i = 0; i < car.wheelsCount; i++) {
                car.updateTyre();
            }
            car.checkEngine();
        } else if (truck != null) {
            System.out.println("Обслуживаем " + truck.modelName);
            for (int i = 0; i < truck.wheelsCount; i++) {
                truck.updateTyre();
            }
            truck.checkEngine();
            truck.checkTrailer();
        } else if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.modelName);
            for (int i = 0; i < bicycle.wheelsCount; i++) {
                bicycle.updateTyre();
            }
        }
    }
}
}*/