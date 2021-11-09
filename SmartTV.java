import java.util.Random;

public class SmartTV extends Product implements Reproducible, Browsable {
    Random rand =  new Random();

    public SmartTV(){        
        String[] brands = {"LG", "Samsung", "Toshiba"};

        this.price = 400;
        this.brand = brands[rand.nextInt(2)];
    }

    public SmartTV(String smarttv[]){
        super(smarttv);
    }
}
