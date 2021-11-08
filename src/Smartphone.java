import java.util.Random;

public class Smartphone extends Product{
    Random rand =  new Random();

    public Smartphone(){        
        String[] brands = {"Apple", "Samsung", "Huawei"};

        this.price = 200;
        this.brand = brands[rand.nextInt(2)];
    }
   
}
