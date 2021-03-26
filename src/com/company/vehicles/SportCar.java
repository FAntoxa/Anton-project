package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car{
   private double maxSpeed;

   public double getMaxSpeed() {
      return maxSpeed;
   }

   public void setMaxSpeed(double maxSpeed) {
      this.maxSpeed = maxSpeed;
   }

   @Override
   public String toString() {
      return super.toString()+", MaxSpeed "+maxSpeed;
   }

   public SportCar(Engine engine, Driver driver, double maxSpeed,String carClass,String model,int mass) {
      super(carClass,model,mass,engine, driver);
      this.maxSpeed = maxSpeed;
   }
}
