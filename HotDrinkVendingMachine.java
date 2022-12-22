import java.util.List;

public class HotDrinkVendingMachine extends VendingMachine{
        
    @Override
    public void initProducts (List <Product> productList){

        HotDrink hotDrink1 = new HotDrink("Green tea", 50.0, 200, 70);
        HotDrink hotDrink2 = new HotDrink(250, 90);
        productList.add(hotDrink1);
        productList.add(hotDrink2);
                
    }
    
    public void getProduct(String name, int volume, int temperature){
        HotDrink hd = new HotDrink(name, temperature, volume, temperature);

        if (hd.getName().equals(name) && hd.getVolume() == volume && hd.getTemperature() == temperature){
            System.out.printf("%s: temperature - %d, volume - %d.\n", name, temperature, volume);
        }else{
            System.out.println("Sorry, your order cannot be executed.\n");
        }
    }    
}
