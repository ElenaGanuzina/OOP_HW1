import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main{
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();
        productList.add(new HotDrink(50, 100));
        productList.add(new Product());
        productList.add(new HotDrink("Green tea", 50.0, 200, 70));
        productList.add(new Product("Chocolate", 100.0));

        System.out.println(Arrays.asList(productList));
        
        VendingMachine vend1 = new VendingMachine();    
        VendingMachine vend2 = new VendingMachine(); 
        vend1.getProduct("Chips");
        vend2.getProduct("Chocolate");

        HotDrinkVendingMachine hd1 = new HotDrinkVendingMachine();
        HotDrinkVendingMachine hd2 = new HotDrinkVendingMachine();

        List<HotDrink> productList1 = new ArrayList<>();
        productList1.add(new HotDrink("Green tea", 50.0, 200, 70));
        productList1.add(new HotDrink("Black tea", 50.0, 200, 90));
        productList1.add(new HotDrink("Coffee", 100.0, 50, 90));

        //hd1.initProducts(productList);
        hd1.getProduct("Green tea");
        hd1.getProduct("Green tea", 70, 200); 
        //hd2.initProducts(productList);

    }
    
}
