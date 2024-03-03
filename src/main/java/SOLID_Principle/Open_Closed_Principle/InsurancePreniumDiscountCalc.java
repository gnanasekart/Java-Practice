package SOLID_Principle.Open_Closed_Principle;


import java.util.Random;

/*
Here we are using a calculation based on health insurance and customer profile.
Assume that if the company need to add more type of Insurance into the system means like
Vehicle Insurance, Home Insurance, etc.
In this case we need to add/modify more no of code in core class. It increases more work and effort.

 */
public class InsurancePreniumDiscountCalc {

    public int calculatePremiumDiscountPercent(HealthInsuranceCustProf customer){
        if(customer.isLoyalCustomer()){
            return 20;
        }
        return 0;
    }
}
 class HealthInsuranceCustProf{
    public boolean isLoyalCustomer() {
        return new Random().nextBoolean();
    }
}
