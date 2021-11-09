import java.util.Random;

public class LinePhone extends Product{
    Random rand =  new Random();
    
    public LinePhone(){        
        String[] brands = {"Claro", "Tigo", "Movistar"};

        this.price = 50;
        this.brand = brands[rand.nextInt(2)];
    }

    public LinePhone(String linep[]){
        super(linep);
    }
}
