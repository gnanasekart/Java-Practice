package SOLID_Principle.Liskov_Substitution_Principle;

import java.util.ArrayList;
import java.util.List;

public class PricingUtils {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new inHouseProduct();

        List<Product> prodList = new ArrayList<>();

        prodList.add(p1);
        prodList.add(p2);
        prodList.add(p3);

        for(Product prod : prodList){
            if(prod instanceof inHouseProduct) {
                ((inHouseProduct) prod).applyExtraDiscount();
            }
            System.out.println(prod.getDiscount());
        }
    }
}

class Product{
    protected double discount=20;
    public double getDiscount() {
        return discount;
    }
}

class inHouseProduct extends Product{
    public void applyExtraDiscount() {
        discount= discount * 1.5;
    }
}