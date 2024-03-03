package SOLID_Principle.Liskov_Substitution_Principle;

public class Car_LSP extends Vehicle_LSP {
    public double getInteriorWidth(){
        return this.getCabinWidth();
    }

    public double getCabinWidth(){
        return 0.0;
    }
}
