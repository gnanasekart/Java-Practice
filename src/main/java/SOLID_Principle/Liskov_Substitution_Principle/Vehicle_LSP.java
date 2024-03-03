package SOLID_Principle.Liskov_Substitution_Principle;

import java.util.ArrayList;
import java.util.List;

/*
Here we changed the calling method with common name
In below two class we can see getInteriorWidth as common method to return cabin or cockpit width
which is an overridden method from vehicle class

 */
public class Vehicle_LSP {
    public double getInteriorWidth() {
        //return interior width
        return 0.0;
    }
}
