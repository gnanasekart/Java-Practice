package SOLID_Principle.Liskov_Substitution_Principle;


    /*
    Let start with a way of thinking as 'Is-A'
    Consider Car as super class, Racing car is different in size and width, and CarUtils extends Car class.
    here we will get missing implementation error at line third car in main class

     */

import java.util.ArrayList;
import java.util.List;

public class Car {
    public double getCabinWidth() {
        //return cabin width
        return 0.0;
    }
}

class CarUtils extends Car {
    public static void main(String[] args) {
        Car first = new Car();
        Car second = new Car();
        Car third = new RacingCar();

        List<Car> myCars = new ArrayList<>();
        myCars.add(first);
        myCars.add(second);
        myCars.add(third);//return error

        for(Car car: myCars){
            System.out.println(car.getCabinWidth());
        }
    }

}

class RacingCar extends Car {
    public double getCabinWidth(){
        //Unimplemented
        return -1;
    }

    public double getCockpitWidth() {
        return 0.0;
    }
}
