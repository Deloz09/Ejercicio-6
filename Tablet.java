import java.util.Random;

public class Tablet extends Product{
    Random rand =  new Random();
    
    public Tablet(){        
        String[] brands = {"Apple", "Samsung", "Huawei"};

        this.price = 150;
        this.brand = brands[rand.nextInt(2)];
    }

    public Tablet(String tablet[]){
        super(tablet);
    }
}
