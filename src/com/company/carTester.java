package com.company;

public class carTester {
    public static void main(String[] args) {

        car newCar = new car();
        newCar.name = "Lamboo";
        newCar.engineCapacity = "445678";
        newCar.doors = 7;
        newCar.model = "aventador";

        System.out.println(newCar.model);

    }
}
