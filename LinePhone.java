import java.util.Random;

public class LinePhone extends Product implements Callable{
    Random rand =  new Random();
    
    
    public LinePhone(){        
        String[] brands = {"Claro", "Tigo", "Movistar"};

        this.price = 50;
        this.brand = brands[rand.nextInt(2)];
        this.type = "linephone";
        setFuncionalities();
        setRange();
    }

    public LinePhone(String linep[]){
        super(linep);
        setFuncionalities();
        setRange();
    }

    private void setFuncionalities(){
        this.functionalities = "1. Hacer llamada";
    }

    private void setRange(){
        this.range = new int[]{1,1};
    }
}
