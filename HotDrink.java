public class HotDrink extends Product{

    private int volume;
    private int temperature;

    public int getVolume() {
        return volume;
    }
    
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    
    public HotDrink(int volume, int temperature){
        this.volume = volume;
        this.temperature = temperature; 
    }
    
    public HotDrink(String name, double price, int volume, int temperature){
        super(name, price);
        this.volume = volume;
        this.temperature = temperature;
    }

    @Override
    public void consume(){
        System.out.println("Hotdrink consumed.");
        volume = 0;
    }
    
    


}
