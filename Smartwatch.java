import java.util.Random;

public class Smartwatch extends Product implements Reproducible, Browsable {
    Random rand =  new Random();
    
    public Smartwatch(){        
        String[] brands = {"Apple", "Samsung", "Huawei"};

        this.price = 150;
        this.brand = brands[rand.nextInt(2)];
    }

    public Smartwatch(String smartw[]){
        super(smartw);
    }
}
