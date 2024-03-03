package SOLID_Principle.Liskov_Substitution_Principle;

public class RacingCar_LSP extends Vehicle_LSP {
    public double getInteriorWidth(){
        return this.getCockpitWidth();
    }

    public double getCockpitWidth(){
        return 0.0;
    }
}
