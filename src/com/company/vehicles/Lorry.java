package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car {
    private int carrying;

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    public Lorry(Engine engine, Driver driver,String carClass,String model,int mass) {
        super(carClass,model,mass,engine,driver);
    }


}
