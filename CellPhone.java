import java.util.Random;

public class CellPhone extends Product implements Callable, Portable{
    Random rand =  new Random();
    
    public CellPhone(){        
        String[] brands = {"Claro", "Nokia", "LG"};

        this.price = 50;
        this.brand = brands[rand.nextInt(2)];
    }

    public CellPhone(String cell[]){
        super(cell);
    }
    
    private void setFuncionalities(){
        this.functionalities = "1. Hacer Llamada \n" +
                                "2. Portar \n";
    }
}
