package SOLID_Principle.Liskov_Substitution_Principle;

import java.util.ArrayList;
import java.util.List;

//This approach is break the hierarchy
public class VehicleUtils_LSP {
    public static void main(String[] args) {
        Vehicle_LSP first = new Car_LSP();
        Vehicle_LSP second = new Car_LSP();
        Vehicle_LSP third = new RacingCar_LSP();

        List<Vehicle_LSP> myVehicles = new ArrayList<>();
        myVehicles.add(first);
        myVehicles.add(second);
        myVehicles.add(third);//return error

        for (Vehicle_LSP vehicle : myVehicles) {
            System.out.println(vehicle.getInteriorWidth());
        }
    }
}
