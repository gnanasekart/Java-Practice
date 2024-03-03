package SOLID_Principle.Liskov_Substitution_Principle;


    /*
    Let start with a way of thinking as 'Is-A'
    Consider Bird as super class and Ostrich 'Is-A' type of Bird, so it try to extends Bird class.

    Note - Ostrich even though it is a bird it cannot be able to fly.
    In below script it shows ostrich class contains un-implementation class.

    Objects should be replaceable with their subtypes without affecting the correctness of the program.

    Liskov Substitution Principle is more standard than 'Is-A' way.

     */

public class Bird {

    public void fly() {
        //fly high
    }
}

class Ostrich extends Bird {

    public void fly() {
        //unimplemented

        throw new RuntimeException();
    }
}
