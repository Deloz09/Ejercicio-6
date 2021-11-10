import java.util.Random;

public class CellPhone extends Product implements Callable, Portable{
    Random rand =  new Random();
    
    public CellPhone(){        
        String[] brands = {"Claro", "Nokia", "LG"};

        this.price = 50;
        this.brand = brands[rand.nextInt(2)];
        this.type = "cellphone";
        setFuncionalities();
        setRange();
    }

    public CellPhone(String cell[]){
        super(cell);
        setFuncionalities();
        setRange();
    }
    
    private void setFuncionalities(){
        this.functionalities = "1. Hacer Llamada \n" +
                                "2. Portar \n";
    }

    private void setRange(){
        this.range = new int[]{1,2};
    }
}
