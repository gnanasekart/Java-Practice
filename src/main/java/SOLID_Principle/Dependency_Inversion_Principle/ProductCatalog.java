package SOLID_Principle.Dependency_Inversion_Principle;

import java.util.Arrays;
import java.util.List;

/*
Here productCatalog have direct connection from high level to low level.
 */
public class ProductCatalog {

    public void listAllProducts(){
        SQLProductRepository sql = new SQLProductRepository();
        List<String> allProd = sql.getAllProductNames();

        //sout
    }
}

class SQLProductRepository{
    public List<String> getAllProductNames() {
        return Arrays.asList("soap", "toothpaste");
    }
}
