import java.util.Random;

public class Smartwatch extends Product implements Photographable, Portable, Callable {
    Random rand =  new Random();
    
    public Smartwatch(){        
        String[] brands = {"Apple", "Samsung", "Huawei"};

        this.price = 150;
        this.brand = brands[rand.nextInt(2)];
        setFuncionalities();
        setRange();
    }

    public Smartwatch(String smartw[]){
        super(smartw);
        setFuncionalities();
        setRange();
    }

    private void  setFuncionalities(){
        this.functionalities =  "1. Portar \n" +
                                 "2. Tomar Foto \n" +
                                 "3. Hacer llamada";
    }

    private void setRange(){
        this.range = new int[]{1,3};
    }
}
