package com.company;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;
import com.company.vehicles.SportCar;

public class Main {

    public static void main(String[] args){
        Driver driver=new Driver("It's me",30,12);
        Engine engine=new Engine(200,"Porshe");
        SportCar sportCar = new SportCar(engine,driver,300,"спортивная","A2",100);
        System.out.println(sportCar);
    }

}