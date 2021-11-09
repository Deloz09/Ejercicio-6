import java.util.Random;

public class Smartphone extends Product implements Callable, Reproducible, Photographable, Portable, Browsable{
    Random rand =  new Random();

    public Smartphone(){        
        String[] brands = {"Apple", "Samsung", "Huawei"};

        this.price = 200;
        this.brand = brands[rand.nextInt(2)];
    }

    public Smartphone(String smartp[]){
        super(smartp);
    }

}
