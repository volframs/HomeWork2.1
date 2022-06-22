package com.company;

public interface ServiceStationForSerSt {
    default void print(Car[] car){
        System.out.println("This report not for you");
        System.out.println();
    };

    void print(Bicycle[] bicycle);

    void print(Truck[] trucks);
}
