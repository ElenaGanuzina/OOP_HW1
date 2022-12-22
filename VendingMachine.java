import java.util.List;

public class VendingMachine {       

    public void initProducts (List <Product> productList){
        //Product product = productList.get(0);    
        Product product1 = new Product ("Chips", 100.0);
        HotDrink product2 = new HotDrink("Chocolate", 120.0, 200, 60);  
            
    }
    
    public void getProduct (String name){
        System.out.printf("%s выдан \n", name );
    }

    public void restore(){
        System.out.println("Автомат загружен \n");
        
    }

     
}

