package SOLID_Principle.Liskov_Substitution_Principle;

import java.util.ArrayList;
import java.util.List;

//This approach is Tell don't ask

public class PricingUtils_LSP {
    public static void main(String[] args) {
        Product_LSP p1 = new Product_LSP();
        Product_LSP p2 = new Product_LSP();
        Product_LSP p3 = new inHouseProduct_LSP();

        List<Product_LSP> prodList = new ArrayList<>();

        prodList.add(p1);
        prodList.add(p2);
        prodList.add(p3);

        //previously we verify weather it is instanceOf or not.
        //we removed that based on Tell don't ask
        for(Product_LSP prod : prodList) {
            System.out.println(prod.getDiscount());
        }
    }
}

class Product_LSP{
    protected double discount=20;
    public double getDiscount() {
        return discount;
    }
}

class inHouseProduct_LSP extends Product_LSP{
    public double getDiscount(){
        this.applyExtraDiscount();
        return discount;
    }
    public void applyExtraDiscount() {
        discount= discount * 1.5;
    }
}