package com.company.vehicles;


import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.professions.Person;

public class Car {
    private String carClass, model;
    private int mass;
    private Engine engine;
    private Driver driver;

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public String getCarClass() {
        return carClass;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Car(String carClass, String model, int mass, Engine engine, Driver driver) {
        this.carClass = carClass;
        this.model = model;
        this.mass = mass;
        this.engine = engine;
        this.driver = driver;
    }



    public static void start() {
        System.out.println("Поехали");
    }


    public static void stop() {
        System.out.println("Останавливаемся");
    }

    public static void turnRight() {
        System.out.println("Поворот направо");
    }
    public static void turnLeft(){
        System.out.println("Поворот налево");
    }
    public String printInfo(){
        return toString();
    }

    @Override
    public String toString() {
        return "Car{" +
                "carClass='" + carClass + '\'' +
                ", model='" + model + '\'' +
                ", mass=" + mass +
                ", engine=" + engine +
                ", driver=" + driver +
                '}';
    }
}

