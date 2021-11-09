import java.util.Random;

public class Laptop extends Product{
    Random rand =  new Random();
    
    public Laptop(){        
        String[] brands = {"HP", "Asus", "DELL"};

        this.price = 500;
        this.brand = brands[rand.nextInt(2)];
    }

    public Laptop(String laptop[]){
        super(laptop);
    }
}
