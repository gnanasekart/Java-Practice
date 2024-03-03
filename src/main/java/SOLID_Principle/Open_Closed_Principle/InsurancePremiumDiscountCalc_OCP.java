package SOLID_Principle.Open_Closed_Principle;

import java.util.Random;

/*
In this case we do not touch the core class. We can extend the functionality by implementing the interface.
Even we can add more no of different insurance class we needed.
 */
public class InsurancePremiumDiscountCalc_OCP {

    public int calculatePremiumDiscountPercent(CustomerProfile customer){
        if(customer.isLoyalCustomer()){
            return 20;
        }
        return 0;
    }
}

class HealthInsuranceCustProf_OCP implements CustomerProfile{
    public boolean isLoyalCustomer() {
        return new Random().nextBoolean();
    }
}

class VehicleInsuranceCustProf_OCP implements CustomerProfile{
    public boolean isLoyalCustomer() {
        return new Random().nextBoolean();
    }
}
