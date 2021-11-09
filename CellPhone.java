import java.util.Random;

public class CellPhone extends Product{
    Random rand =  new Random();
    
    public CellPhone(){        
        String[] brands = {"Claro", "Nokia", "LG"};

        this.price = 50;
        this.brand = brands[rand.nextInt(2)];
    }

    public CellPhone(String cell[]){
        super(cell);
    }
}
