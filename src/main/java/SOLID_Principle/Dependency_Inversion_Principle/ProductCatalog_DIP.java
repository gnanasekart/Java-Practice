package SOLID_Principle.Dependency_Inversion_Principle;

import java.util.Arrays;
import java.util.List;

public class ProductCatalog_DIP {

    public void listAllProducts() {
        ProductRepository sql = ProductFactory.create();
        List<String> allProd = sql.getAllProdNames();

        //sout
    }
}

interface ProductRepository{
    public List<String> getAllProdNames();
}

class ProductFactory{
    public static ProductRepository create() {
        return new SQLProductRepository_DIP();
    }
}

class SQLProductRepository_DIP implements ProductRepository{
    public List<String> getAllProdNames() {
        return Arrays.asList("soap", "toothpaste");
    }
}
